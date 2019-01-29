import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingTest {

    @Test
    public  void testGutterGame() {
        Bowling game = new Bowling();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }


    @Test
    public  void testNormalGame() {
        Bowling game = new Bowling();
        for (int i = 0; i < 20; i++) {
            game.roll(3);
        }
        assertEquals(60, game.score());
    }



        @Test
        public  void testSpare(){
            Bowling game = new Bowling();

                game.roll(3);
                game.roll(7);
                game.roll(5);

            assertEquals(15, game.score());}



            @Test
            public  void testStrikeGame() {
                Bowling game = new Bowling();
                for (int i = 0; i < 20; i++) {
                    game.roll(1);
                }
                assertEquals(10, game.score());
            }










        }

}