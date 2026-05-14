import java.util.List; 

class SqueakyClean {
    static String clean(String identifier) {
        String res = "";
        List<Character> chars_0 = List.of('4', '3', '0', '1', '7');
        List<Character> chars_1 = List.of('a', 'e', 'o', 'l', 't');
        for (int i = 0; i < identifier.length(); i++) {
            if (identifier.charAt(i) == ' ') {
                res += "_";
            } else if (identifier.charAt(i) == '-') {
                i++;
                res += Character.toUpperCase(identifier.charAt(i));
            } else if (chars_0.contains(identifier.charAt(i))) {
                int index = chars_0.indexOf(identifier.charAt(i));
                res += chars_1.get(index);
            } else if (Character.isLetter(identifier.charAt(i))) {
                res += identifier.charAt(i);
            }
        }
        return res;
    }
}
