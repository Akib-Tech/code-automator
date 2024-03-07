package codeautomator;

import codeautomator.featuregenerator.HeaderFeatures;

class AppGenerator {
    String generateCode(){
       // String headerFeature = Configuration.getHeaderFeature();
        String codeNumber = Configuration.getCodeNumber();   
        String feature = Configuration.getFeature();                           
        HeaderFeatures fetchHeader = new HeaderFeatures();
        return fetchHeader.getFeature(feature,codeNumber);
        
             }
    }




