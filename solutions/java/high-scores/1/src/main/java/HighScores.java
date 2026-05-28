import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    private List<Integer> score;
    
    public HighScores(List<Integer> highScores) {
        this.score = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return new ArrayList<>(this.score);
    }

    Integer latest() {
        return this.score.get(this.score.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(this.score);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(this.score);
        sortedScores.sort(Collections.reverseOrder());
        return sortedScores.subList(0, Math.min(3, sortedScores.size()));
    }

}
