public class Runner {

    public static void main(String[] args) {

        EightBall eightBall = new EightBall();
        eightBall.addAnswer("Most likely");
        eightBall.addAnswer("Ask again later");
        eightBall.addAnswer("Very doubtful");
        eightBall.addAnswer("Yes");
        eightBall.addAnswer("Without a doubt");

        String answer = eightBall.getRandomAnswer();

        System.out.println(answer);
    }


}
