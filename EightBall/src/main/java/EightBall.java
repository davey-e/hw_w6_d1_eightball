import java.util.ArrayList;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(){
        this.answers = new ArrayList<>();
    }

    public int getAnswerCount() {
        return this.answers.size();
    }
}
