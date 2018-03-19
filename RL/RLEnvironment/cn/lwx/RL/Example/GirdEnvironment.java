package cn.lwx.RL.Example;

import cn.lwx.RL.Environment.RLAction;
import cn.lwx.RL.Environment.RLEnvironment;

import java.util.HashMap;

public class GirdEnvironment extends RLEnvironment {
    private int[][] grid;
    private int cols;
    private int rows;
    private int num;

    public GirdEnvironment(MoveAction action, int rows, int cols) {
        super(action);
        this.cols = cols;
        this.rows = rows;
        num = 0;
        grid = new int[rows][cols];
    }

    public void setBarrier(int x, int y) {
        if (x >= rows || y >= cols)
            return;
        grid[y][x] = -1;
    }

    @Override
    public void reset() {
        num = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
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
        for (int i = 0; i < rows; i++) {
            stringBuilder.append("[");
            for (int j = 0; j < cols; j++) {
                stringBuilder.append(grid[i][j]);
                stringBuilder.append("\t");
                stringBuilder.append(",");
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
        GirdEnvironment environment = new GirdEnvironment(action, 5, 5);
        environment.reset();
        environment.setBarrier(1,2);

        environment.render();
    }
}
