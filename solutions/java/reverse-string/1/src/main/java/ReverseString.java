class ReverseString {

    String reverse(String inputString) {
        String res = "";
        for (int i = 0; i < inputString.length(); i++) {
            res = inputString.charAt(i) + res;
        }
        return res;
    }
  
}
