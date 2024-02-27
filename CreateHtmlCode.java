import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class CreateHtmlCode {
    public static void main (String[] args) {
         String CONFIG_FILE = "config.properties";
        Properties properties;
        properties  = new Properties();
   
    try(FileInputStream getConfigFile = new FileInputStream(CONFIG_FILE)){
        properties.load(getConfigFile);
    }catch(IOException e){
        e.printStackTrace();
    }
    
       String codeRequest = properties.getProperty("feature"); 
       String getNum = properties.getProperty("codenumber");
       int codeNum = Integer.parseInt(getNum);
    String result = "";
        switch (codeRequest.toLowerCase()) {
            case "logo":
            for(int i = 0; i < codeNum; i++){
                result += "<img src=\"\" width=\"\" height=\"\" /> \n";
            } 
                break;
            case "link-list":
            result += "<ul> \n";
            for(int i = 0; i < codeNum; i++){
                result += "<li><a href=\"\">...</a></li> \n";
            } 
                result += "</ul>";
                break;
            case "list":
                result += "<ul> \n";
            for(int i = 0; i < codeNum; i++){
                result += "<li>...</li> \n";
            } 
                result += "</ul>";
                break;
            case "link":
            for(int i = 0; i < codeNum; i++){
                result += "<a>...</a> \n";
            } 
                break;
            case "title":
            for(int i = 0; i < codeNum; i++){
                result += "<strong>...</strong> \n";
            } 
                break;
            case "search":
            for(int i = 0; i < codeNum; i++){
                result += "<input type=\"text\" /> \n";
            } 
                break;
            case "nav":
            for(int i = 0; i < codeNum; i++){
                result += "<nav>...</nav> \n";
            } 
                    break; 
            default:
            result = "Code not available";
                break;
        }
        System.out.println(result);
       
    }
    
}