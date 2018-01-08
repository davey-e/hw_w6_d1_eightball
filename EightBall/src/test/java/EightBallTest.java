import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightBall;

    @Before
    public void before(){
        eightBall = new EightBall();
        eightBall.addAnswer("Most likely");
        eightBall.addAnswer("Ask again later");
        eightBall.addAnswer("Very doubtful");
    }
    @Test
    public void answersArrayListHasLength(){
        assertEquals(3, eightBall.getAnswerCount());
    }

    @Test
    public void canAddItemsToAnswers(){
        eightBall.addAnswer("Yes");
        assertEquals(4, eightBall.getAnswerCount());
    }


}
