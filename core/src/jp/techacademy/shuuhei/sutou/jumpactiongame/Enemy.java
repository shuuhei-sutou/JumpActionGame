package jp.techacademy.shuuhei.sutou.jumpactiongame;

/**
 * Created by user on 2018/03/15.
 */

import com.badlogic.gdx.graphics.Texture;

public class Enemy extends GameObject{
    public static final float STAR_WIDTH = 0.9f;
    public static final float STAR_HEIGHT = 0.9f;

    public static final int STAR_EXIST = 0;
    public static final int STAR_NONE = 1;

    int mState;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(STAR_WIDTH, STAR_HEIGHT);
        mState = STAR_EXIST;
    }
}
