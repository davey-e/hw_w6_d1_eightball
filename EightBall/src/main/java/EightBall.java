import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(){
        this.answers = new ArrayList<>();
    }

    public int getAnswerCount() {
        return this.answers.size();
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public String getRandomAnswer() {
        Collections.shuffle(this.answers);
        return this.answers.get(0);
    }
}
