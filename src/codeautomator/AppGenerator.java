package codeautomator;
import codeautomator.featuregenerator.Feature;


class AppGenerator {
    String generateCode(){
        String[] features = Configuration.getFeatures().split(",");                           
        return Feature.getFeatureCode(features);
    }
}




