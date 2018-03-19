package cn.lwx.RL.Environment;

public abstract class RLEnvironment {
    private RLState state;
    private RLReward reward;
    private RLAction action;

    public abstract void reset();
    public abstract void render();
    public abstract void step(RLAction action);

    public RLEnvironment(RLAction action) {
        this.action = action;
    }

    public RLState getState() {
        return state;
    }

    public void setState(RLState state) {
        this.state = state;
    }

    public RLReward getReward() {
        return reward;
    }

    public void setReward(RLReward reward) {
        this.reward = reward;
    }
}
