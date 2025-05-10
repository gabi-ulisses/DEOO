package aulas.rede.jogo;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Config {
    
    private static String ip;
    private static int porta = -1;
    
    private Config() {
    }
    
    private static void readConfig() {
        
        File file = new File("config.xml");
        if( file.exists() ) {
            
            try {
                
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();        
                Document doc = docBuilder.parse( file );
                doc.getDocumentElement().normalize();
                
                Element root = doc.getDocumentElement();                
                Node node = root.getElementsByTagName("servidor").item(0);
                
                ip = node.getAttributes().getNamedItem("ip").getNodeValue();
                porta = Integer.parseInt( node.getAttributes().getNamedItem("porta").getNodeValue() );
                
            } catch ( Exception ex ) {
                ex.printStackTrace();
            }
            
        }
    }

    public static String getIp() {
        
        if ( ip == null )
            readConfig();
        
        return ip;
    }
    
    public static int getPorta() {
        
        if ( porta == -1 )
            readConfig();
        
        return porta;
    }
        
}