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
        int sum = 0;
        for (int i = 0; i < codes.length; i++) {
            if (codes[i] == colors[0]) {
                sum += i * 10;
            }
        }

        for (int i = 0; i < codes.length; i++) {
            if (codes[i] == colors[1]) {
                sum += i;
            }
        }
        return sum;
    }
}
