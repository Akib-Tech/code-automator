class CreateHtmlCode {
    
    public static void main (String[] args) {
       Configuration verifyConfiguration = new Configuration();
       String[] getConfigValue =  verifyConfiguration.checkConfiguraton("HEADER_FEATURE","CODE_NUMBER");                              
    
       if((getConfigValue[0] != null) && (getConfigValue[1] != null)){
        String codeRequest = getConfigValue[0];
        String getNum = getConfigValue[1];
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
        }else{
           System.out.println("Variables required not found");
        }
       
       
    }
    
}
class Configuration extends CreateHtmlCode {
   String[] checkConfiguraton(String featureName, String codeNumber){
    String checkedConfiguration[] = new String[2] ;
        checkedConfiguration[0] = System.getenv(featureName);
        checkedConfiguration[1] = System.getenv(codeNumber);
        System.out.println(checkedConfiguration[0]);
        System.out.println(checkedConfiguration[1]);
        return checkedConfiguration;
    }

}