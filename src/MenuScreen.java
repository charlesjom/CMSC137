
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class MenuScreen extends BasicGameState{
    String input = "";

    public MenuScreen(int state){

    }

    public void init(GameContainer gameContainer, StateBasedGame game) throws SlickException{
        gameContainer.setShowFPS(false);
    }

    public void render(GameContainer gameContainer, StateBasedGame game, Graphics g) throws SlickException{
        g.drawString(input, 180, 100);
        g.drawString("Snake vs Blocks", 180, 210);
        g.drawLine(180, 240, 320, 240);
        g.drawString("Play", 180, 250);
//        g.drawRect(180, 250, 35, 20);
        g.drawString("Multiplayer", 180, 290);
//        g.drawRect(180, 290, 100, 20);
        g.drawString("Quit", 180, 330);
//        g.drawRect(180, 330, 35, 20);

        int mX = Mouse.getX();
        int mY = Mouse.getY();
//        input = "X: " + mX + "Y: " + mY;
        if((mX>180&&mX<215) && (mY>640-270 && mY<640-250)){ // play button
            if(Mouse.isButtonDown(0)){
                game.enterState(1);
            }
        }
        if((mX>180&&mX<280) && (mY>640-310 && mY<640-290)){ // multi button
            if(Mouse.isButtonDown(0)){
                game.enterState(3);
            }
        }
        if((mX>180&&mX<215) && (mY>640-350 && mY<640-330)){ // quit button
            if(Mouse.isButtonDown(0)){
                gameContainer.exit();
            }
        }

    }

    public void update(GameContainer gameContainer, StateBasedGame game, int delta) throws SlickException{

    }

    public int getID(){
        return 0;
    }
}
