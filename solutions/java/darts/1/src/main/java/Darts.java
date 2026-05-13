class Darts {
    int score(double xOfDart, double yOfDart) {
        double dist = Math.pow(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2), 0.5);
        int points = 0;
        if (dist <= 1.0) {
            points = 10;
        } else if (dist <= 5.0) {
            points = 5;
        } else if (dist <= 10.0) {
            points = 1;
        }
        return points;
    }
}
