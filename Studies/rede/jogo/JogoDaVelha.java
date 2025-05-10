package aulas.rede.jogo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class JogoDaVelha {
    
    private Scanner console;
    
    private String[][] tabuleiro;
    private boolean fim;
    
    private String marcador;
    
    private Socket servidorConexao;
    private ObjectInputStream servidorEntrada;
    private ObjectOutputStream servidorSaida;
    
    private boolean suaVez;

    public JogoDaVelha() throws Exception {
        
        console = new Scanner(System.in);
        
        tabuleiro = new String[3][3];
        
        conectar();
        
        iniciar();
        
        jogar();
        
    }
    
    private void conectar() throws Exception {
        
        servidorConexao = new Socket(InetAddress.getByName(Config.getIp()), Config.getPorta());
        
        servidorSaida = new ObjectOutputStream(servidorConexao.getOutputStream());
        servidorSaida.flush();
        
        servidorEntrada = new ObjectInputStream(servidorConexao.getInputStream());
        
        String mensagem = (String) servidorEntrada.readObject(); // "X;true"; // receber essa mensagem do servidor
        
        String[] info = mensagem.split(";");
        setMarcador( info[0] );
        
        if( info[1].equals("true") ) {
            setSuaVez(true);
        } else {
            setSuaVez(false);
        }
        
    }
    
    public void iniciar() {
        
        for(int l = 0; l < 3; l++) {
            for(int c = 0; c < 3; c++) {
                tabuleiro[l][c] = "  ";
            }
        }
        
        fim = false;
        
    }
    
    public void jogar() throws Exception {
        
        int linha = -1, coluna = -1;
        String mensagem;
        
        while( fim == false ) {
            
            if( isSuaVez() == false ) { 
                
                System.out.println( toString() );
                System.out.println("Espere sua vez.");
                
                mensagem = (String) servidorEntrada.readObject(); // "1;1;O"; // receber essa mensagem info do servidor
                
                String[] info = mensagem.split(";");
                
                linha = Integer.parseInt( info[0] );
                coluna = Integer.parseInt( info[1] );
                
                marcar(linha, coluna, info[2]);
                
                setSuaVez(true);
                
                checarTermino();
                
            }
            
            boolean marcado = false;    
            while( fim == false && 
                    marcado == false ) {
                
                System.out.println( toString() );
            
                System.out.print("Informe a linha: ");
                linha = console.nextInt() - 1;

                System.out.print("Informe a coluna: ");
                coluna = console.nextInt() - 1;
                
                marcado = marcar(linha, coluna);
                
                if( marcado == false ) {
                    System.out.println("Linha e/ou Coluna Inválido(s)!\n");
                }                
                
            }
            
            mensagem = linha + ";" + coluna + ";" + getMarcador();
            servidorSaida.writeObject(mensagem); // enviar essa mensagem para o servidor
            
            setSuaVez(false);
            
            checarTermino();
            
        }
    }
    
    private void checarTermino() {
        
        String marcadorGanhador = ganhador();
            if( marcadorGanhador != null ) {
                
                fim = true;
                
                System.out.println(this);
                
                if( marcadorGanhador.equals( getMarcador() ) ) {
                    System.out.print("Você Ganhou! :)\n");
                } else {                    
                    if( marcadorGanhador.equals("empate") ) {
                        System.out.print("Você Empatou! :|\n");
                    } else {
                        System.out.print("Você Perdeu! :(\n");
                    }
                }
                
            }
            
            if( fim == true ) {
                checarReinicio();
            }
        
    }
    
    private void checarReinicio() {
        
        char resposta = ' ';        
        while( resposta != 'S' &&
                resposta != 'N' ) {
            
            System.out.print("Deseja Jogar Novamente (S/N): ");
            resposta = console.next().charAt(0);
            
            if( resposta != 'S' &&
                resposta != 'N' ) {
                System.out.println("Resposta Inválida!");
            }
            
        }
        
        if( resposta == 'S' ) {
            iniciar();
        }
        
    }
    
    private String ganhador() {
        
        if( tabuleiro[0][0].equals("  ") == false &&
                tabuleiro[0][1].equals("  ") == false &&
                tabuleiro[0][2].equals("  ") == false &&
                tabuleiro[1][0].equals("  ") == false &&
                tabuleiro[1][1].equals("  ") == false &&
                tabuleiro[1][2].equals("  ") == false &&
                tabuleiro[2][0].equals("  ") == false &&
                tabuleiro[2][1].equals("  ") == false &&
                tabuleiro[2][2].equals("  ") == false ) {
            return "empate";
        }
        
        if( tabuleiro[0][0].equals("  ") == false &&
                tabuleiro[0][0].equals( tabuleiro[1][1] ) == true && 
                tabuleiro[1][1].equals( tabuleiro[2][2] ) == true ) {
            return tabuleiro[0][0];
        }
        
        for( int i = 0; i < 3; i++ ) {
        
            if( tabuleiro[i][0].equals("  ") == false &&
                    tabuleiro[i][0].equals( tabuleiro[i][1] ) == true && 
                    tabuleiro[i][1].equals( tabuleiro[i][2] ) == true ) {
                return tabuleiro[i][0];
            }
            
            if( tabuleiro[0][i].equals("  ") == false &&
                    tabuleiro[0][i].equals( tabuleiro[1][i] ) == true && 
                    tabuleiro[1][i].equals( tabuleiro[2][i] ) == true ) {
                return tabuleiro[0][i];
            }
            
        }
        
        return null;
    }
    
    private boolean marcar(int linha, int coluna) {
        return marcar( linha, coluna, getMarcador() );
    }
    
    private boolean marcar(int linha, int coluna, String marcador) {
        
        if( linha < 0 || linha > 2 || coluna < 0 || coluna > 2  ) {
            return false;
        }
            
        if( tabuleiro[linha][coluna].equals("  ") == true ) {
            
            tabuleiro[linha][coluna] = marcador;
            return true;
            
        } else {
            return false;
        }
        
    }

    public String getMarcador() {
        return marcador;
    }

    private void setMarcador(String marcador) {
        if( marcador.equals("X") || marcador.equals("O") ) {
            this.marcador = marcador;
        } else {
            throw new IllegalArgumentException("O marcador deve ser X ou O.");
        }
    }

    public boolean isSuaVez() {
        return suaVez;
    }

    public void setSuaVez(boolean suaVez) {
        this.suaVez = suaVez;
    }
    
    @Override
    public String toString() {
        String resultado = "\n";
        
        for(int l = 0; l < 3; l++) {
           for(int c = 0; c < 3; c++) {
              resultado += "[  " + tabuleiro[l][c] + "  ]";
           }
           resultado += "\n";
        }
        
        return resultado;              
    }
    
}