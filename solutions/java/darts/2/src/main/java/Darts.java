class Darts {
    int score(double xOfDart, double yOfDart) {
        double dist = xOfDart * xOfDart + yOfDart * yOfDart;
        int points = 0;
        if (dist <= 1.0) {
            points = 10;
        } else if (dist <= 25.0) {
            points = 5;
        } else if (dist <= 100.0) {
            points = 1;
        }
        return points;
    }
}
