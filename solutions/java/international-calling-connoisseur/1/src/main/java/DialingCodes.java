import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> some = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return this.some;
    }

    public void setDialingCode(Integer code, String country) {
        this.some.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.some.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (this.some.containsKey(code) || this.some.containsValue(country)) {
            return;
        } else {
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        if (this.some.containsValue(country)) {
            for (Integer code: this.some.keySet()) {
                if (this.some.get(code) == country) {
                    return code;
                } 
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer c = findDialingCode(country);
        if (c == null) {
            return;
        }
        this.some.remove(c);
        setDialingCode(code, country);
    }
}
