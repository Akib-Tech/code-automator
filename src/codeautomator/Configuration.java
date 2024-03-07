package codeautomator;

public class Configuration {
    static final String HEADER_FEATURE = "HEADER_FEATURE";
    static final String CODE_NUMBER    = "CODE_NUMBER";
    static final String FEATURE        = "HEADER";
        public static String getHeaderFeature(){
            return getEnvVariable(FEATURE);
        }
        public static String getCodeNumber(){
            return getEnvVariable(CODE_NUMBER);
        }
        private static String getEnvVariable(String envKey){
           return System.getenv(envKey);
        }
}
