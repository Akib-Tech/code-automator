class CreateHtmlCode {
    public static void main (String[] args) {
        String headerFeature = System.getenv("HEADER_FEATURE");
        String featureNumber = System.getenv("CODE_NUMBER");
        System.out.println("The feature and numbers are : "+ featureNumber + " "+ headerFeature);
        if((headerFeature != null) && (featureNumber != null)){
        String codeRequest = headerFeature;
        String getNum = featureNumber;
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