package codeautomator;
import codeautomator.featuregenerator.HeaderFeatures;
    
    class AppGenerator {
        String generateCode(){
           // String headerFeature = Configuration.getHeaderFeature();
            String codeNumber = Configuration.getCodeNumber();   
            String[] features = Configuration.getFeatures().split(",");                           
            HeaderFeatures fetchHeader = new HeaderFeatures();
            String result = "";
            for (String feature : features) {
              result +=  fetchHeader.getFeature(feature,codeNumber);
            }
            
            return result;
                 }
        }
    
    
    
    
    
