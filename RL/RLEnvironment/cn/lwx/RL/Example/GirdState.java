package cn.lwx.RL.Example;

import cn.lwx.RL.Environment.RLState;

/**
 * Package: cn.lwx.RL.Example
 * Comments:
 * Author: lwx
 * Create Date: 2018/3/19
 * Modified Date: 2018/3/19
 * Why & What is modified:
 * Version: 0.0.1beta
 * It's the only NEET thing to do. – Shionji Yuuko
 */
public class GirdState extends RLState {
    private int x;
    private int y;
    private boolean isTerminate;

    public GirdState(int x, int y) {
        this.x = x;
        this.y = y;
        isTerminate = false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isTerminate() {
        return isTerminate;
    }

    public void setTerminate(boolean terminate) {
        isTerminate = terminate;
    }
}
