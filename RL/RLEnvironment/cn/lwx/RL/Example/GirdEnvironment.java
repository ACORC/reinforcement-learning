package cn.lwx.RL.Example;

import cn.lwx.RL.Environment.RLAction;
import cn.lwx.RL.Environment.RLEnvironment;

import java.util.HashMap;

public class GirdEnvironment extends RLEnvironment {
    private double[][] grid;
    private int cols;
    private int rows;
    private int num;

    public GirdEnvironment(MoveAction action, int cols, int rows) {
        super(action);
        this.cols = cols;
        this.rows = rows;
        num = 0;
        grid = new double[cols][rows];
    }

    @Override
    public void reset() {
        num = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                grid[i][j] = 0;
            }
        }
    }

    @Override
    public void render() {
        System.out.println(this);
    }

    @Override
    public void step(RLAction action) {

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String temp = "Iteration: "+num+"\n";
        for (int i = 0; i < cols; i++) {
            stringBuilder.append("[");
            for (int j = 0; j < rows; j++) {
                stringBuilder.append(grid[i][j] + ",");
            }
            stringBuilder.replace(stringBuilder.lastIndexOf(","),stringBuilder.lastIndexOf(",")+1,"");
            stringBuilder.append("]\n");
        }
        temp += stringBuilder.toString();
        return temp;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"up");
        hashMap.put(1,"down");
        hashMap.put(2,"left");
        hashMap.put(3,"right");
        MoveAction action = new MoveAction(hashMap);
        GirdEnvironment environment = new GirdEnvironment(action, 3, 3);

        environment.reset();
        environment.render();
    }
}
