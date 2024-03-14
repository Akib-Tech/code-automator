package codeautomator;

//import codeautomator.featuregenerator.Feature;

public class Configuration {
    static final String FEATURES = "HEADER_FEATURE";
        public static String getFeatures(){
            return getEnvVariable(FEATURES);
        }
    
        private static String getEnvVariable(String envKey){
           return System.getenv(envKey);
        }
       
}
