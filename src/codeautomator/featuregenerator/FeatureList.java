package codeautomator.featuregenerator;
import java.util.HashMap;
public class FeatureList{

public static String listFeature(String featureName){
    HashMap <String, HeaderFeatures> mape = new HashMap<>();
    HeaderFeatures headerFeatures = new HeaderFeatures();
    mape.put("header",headerFeatures.getFeature(featureName));

    return mape.get("header");
}

}
