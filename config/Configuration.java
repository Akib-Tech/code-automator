package config;

public class Configuration {
    static final String HEADER_FEATURE = "HEADER_FEATURE";
    static final String CODE_NUMBER     = "CODE_NUMBER";
        public static String getHeaderFeature(){
            return getEnvVariable(HEADER_FEATURE);
        }
        public static String getCodeNumber(){
            return getEnvVariable(CODE_NUMBER);
        }
        public static String getEnvVariable(String envKey){
           return System.getenv(envKey);
        }
    }
