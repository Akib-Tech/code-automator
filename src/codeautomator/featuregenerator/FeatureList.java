package codeautomator.featuregenerator;
import java.util.HashMap;
import java.util.Map;
public class FeatureList{
   static Map <String, Class<Feature> > featureListMap;
   static{
    featureListMap = new HashMap<>();
    featureListMap.put("header", HeaderFeatures.class);
   }
}
