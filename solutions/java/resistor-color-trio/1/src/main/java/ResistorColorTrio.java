class ResistorColorTrio {

    private final String[] codes = {
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    };

    String label(String[] colors) {

        int first = colorCode(colors[0]);
        int second = colorCode(colors[1]);
        int multiplier = colorCode(colors[2]);

        long value = (first * 10L + second);

        value *= (long) Math.pow(10, multiplier);

        if (value >= 1_000_000_000) {
            return (value / 1_000_000_000) + " gigaohms";
        }

        if (value >= 1_000_000) {
            return (value / 1_000_000) + " megaohms";
        }

        if (value >= 1_000) {
            return (value / 1_000) + " kiloohms";
        }

        return value + " ohms";
    }

    private int colorCode(String color) {
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(color)) {
                return i;
            }
        }
        return -1;
    }
}