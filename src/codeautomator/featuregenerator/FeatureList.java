package codeautomator.featuregenerator;
import java.util.HashMap;
public class FeatureList{

public static String listFeature(String featureName){
    HashMap <String, Class<?> > HeaderFeatureList = new HashMap<String, Class<?> >();
    HeaderFeatureList.put("header", HeaderFeatures.class);
    
}

}
