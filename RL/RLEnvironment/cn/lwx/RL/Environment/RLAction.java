package cn.lwx.RL.Environment;

import java.util.HashMap;

public abstract class RLAction {
    private HashMap<Integer, String> legalAction;

    public RLAction(HashMap<Integer, String> legalAction) {
        this.legalAction = legalAction;
    }

    public boolean isActionLegal (String action) {
        return legalAction.containsValue(action);
    }
}
