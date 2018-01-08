import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightBall;

    @Before
    public void before(){
        eightBall = new EightBall();
    }
    @Test
    public void answersArrayListHasLength(){
        assertEquals(0, eightBall.getAnswerCount());
    }

    @Test
    public void canAddItemsToAnswers(){
        eightBall.addAnswer("Yes");
        assertEquals(1, eightBall.getAnswerCount());
    }
}
