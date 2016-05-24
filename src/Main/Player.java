package Main;

import java.awt.*;
import java.util.Random;

/**
 * Created by joao on 09-05-2016.
 */
public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id){
        super(x,y,id);
    }

    @Override
    public void tick(){
        x+=velX;
        y+=velY;
    }

    @Override
    public void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x,y,32,32);

    }

}
