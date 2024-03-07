package codeautomator;

import codeautomator.featuregenerator.HeaderFeatures;

class AppGenerator {
    String generateCode(){
        String headerFeature = Configuration.getHeaderFeature();
        String codeNumber = Configuration.getCodeNumber();                              
        HeaderFeatures fetchHeader = new HeaderFeatures();
        return fetchHeader.getFeature(headerFeature,codeNumber);
        
             }
    }




