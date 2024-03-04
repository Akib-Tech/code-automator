import config.*;

class CreateHtmlCode{
    public static void main (String[] args) {
        String headerFeature = Configuration.getHeaderFeature();
        String codeNumber = Configuration.getCodeNumber();                              
     
       if((headerFeature != null) && (codeNumber != null)){
        int intCodeNumber = Integer.parseInt(codeNumber);
        String result = "";
        switch (headerFeature.toLowerCase()) {
            case "logo":
            for(int i = 0; i < intCodeNumber; i++){
                result += "<img src=\"\" width=\"\" height=\"\" /> \n";
            } 
                break;
            case "link-list":
            result += "<ul> \n";
            for(int i = 0; i < intCodeNumber; i++){
                result += "<li><a href=\"\">...</a></li> \n";
            } 
                result += "</ul>";
                break;
            case "list":
                result += "<ul> \n";
            for(int i = 0; i < intCodeNumber; i++){
                result += "<li>...</li> \n";
            } 
                result += "</ul>";
                break;
            case "link":
            for(int i = 0; i < intCodeNumber; i++){
                result += "<a>...</a> \n";
            } 
                break;
            case "title":
            for(int i = 0; i < intCodeNumber; i++){
                result += "<strong>...</strong> \n";
            } 
                break;
            case "search":
            for(int i = 0; i < intCodeNumber; i++){
                result += "<input type=\"text\" /> \n";
            } 
                break;
            case "nav":
            for(int i = 0; i < intCodeNumber; i++){
                result += "<nav>...</nav> \n";
            } 
                    break; 
            default:
            result = "Code not available";
                break;
        }
        System.out.println(result);
        }else{
           System.out.println("Variables required not found");
        }
    
    }
    
}
