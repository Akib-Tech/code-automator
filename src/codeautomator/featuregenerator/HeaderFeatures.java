package codeautomator.featuregenerator;
public class HeaderFeatures implements Feature{
   public String getFeature(String headerFeature,String codeNumber){
    String result = "";
    if((headerFeature != null) && (codeNumber != null)){
    int intCodeNumber = Integer.parseInt(codeNumber);
    
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
            result += "</ul> \n";
            break;
        case "list":
            result += "<ul> \n";
        for(int i = 0; i < intCodeNumber; i++){
            result += "<li>...</li> \n";
        } 
            result += "</ul> \n";
            break;
        case "links":
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
    return result;
    }else{
    result = "Variables required not found";
    return result;
    }
    }


}





