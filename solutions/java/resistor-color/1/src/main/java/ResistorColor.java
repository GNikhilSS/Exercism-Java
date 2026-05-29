import java.util.Map;

class ResistorColor {
    private String[] codes = {
        "black",
        "brown",
        "red",
        "orange",
        "yellow",
        "green",
        "blue",
        "violet",
        "grey",
        "white"
    };
    
    int colorCode(String color) {
        for (int i = 0; i < this.codes.length; i++) {
            if (color == this.codes[i]) {
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        return this.codes;
    }
}
