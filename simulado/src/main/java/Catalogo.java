
import java.util.ArrayList;
import java.util.stream.Stream;

public class Catalogo {
    
    private ArrayList<Video> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
    }
    
    public boolean adicionar(Video video) throws ErroCritico{
        if(catalogo.contains(video)){
            throw new ErroCritico("Vídeo existente");
        }else{
            catalogo.add(video);
            return true;
        }
    }
    
    public boolean remover(Video video){
        if(catalogo.contains(video)){
            catalogo.remove(video);
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return catalogo.toString();
    }
     
/*  
*    Quebra a integridade do objeto:
*    
*    public ArrayList<Video> getStream(){
*        return catalogo;
*    }
*/     
    
    public Stream<Video> getStream(){
        
        return catalogo.stream();
    }
    
    
}
