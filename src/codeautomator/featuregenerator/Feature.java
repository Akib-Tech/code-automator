package codeautomator.featuregenerator;

public class Feature {
  static  String result = "";
  static  HeaderFeatures fetchHeaders = new HeaderFeatures();
public static String getFeatureCode(String[] features){
    for (String feature : features) {
        result += fetchHeaders.listFeature(feature);
     }
     return result;
}
    
}