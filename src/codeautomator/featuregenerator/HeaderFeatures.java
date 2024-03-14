package codeautomator.featuregenerator;
import java.util.HashMap;
public class HeaderFeatures{

public static String listFeature(String featureName){
    HashMap <String, String> mape = new HashMap<>();
    mape.put("header","<header>...</header>");
    mape.put("logo","<img src=\"\" width=\"\" height=\"\" /> \n");
    mape.put("list","<ul> \n <li>...</li> \n</ul> \n");
    mape.put("title","<strong>...</strong> \n");
    mape.put("search","<input type=\"text\" /> \n");
    mape.put("nav","<nav>...</nav> \n");
    mape.put("link-list","<ul> \n <li><a href=\"\">...</a></li> \n </ul> \n");
    mape.put("links","<a href=\"\">...</a> \n");
    
    return mape.get(featureName);
}

}
