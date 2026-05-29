class ResistorColorDuo {
    private final String[] codes = {
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
    
    int value(String[] colors) {
        return colorCode(colors[1]) + colorCode(colors[0]) * 10;
    }

    int colorCode(String color) {
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(color)) {
                return i;
            }
        }
        return -1;
    }
}
