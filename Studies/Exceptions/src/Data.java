public class Data {
    private int dia, mes, ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }else{
            throw new RuntimeException("O dia deve estar entre 1 e 31.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else{
            throw new Exception("O mês deve estar entre 1 e 12.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
         if(ano >0){
            this.ano = ano;
        }else{
            throw new RuntimeException("O ano tem que ser positivo.");
        }
    }
}