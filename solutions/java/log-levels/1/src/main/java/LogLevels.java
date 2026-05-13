public class LogLevels {
    
    public static String message(String logLine) {
        int num = 0;
        String result = "";
        for (int i = 1; i < logLine.length(); i++) {
            if (logLine.charAt(i) == ' ') {
                num = i + 1;
                break;
            }
        }

        for (int i = num; i < logLine.length(); i++) {
            result = result + logLine.charAt(i);
        }
        return result.trim();
        
    }

    public static String logLevel(String logLine) {
        String result = "";
        for (int i = 1; i < logLine.length(); i++) {
            if (logLine.charAt(i) == ']') {
                break;
            }
            result = result + logLine.charAt(i);
        }
        
        return result.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ')';
    }
}
