package cn.lwx.RL.Example;

import cn.lwx.RL.Environment.RLAction;

import java.util.HashMap;

public class MoveAction extends RLAction {
    public MoveAction(HashMap<Integer, String> legalAction) {
        super(legalAction);
    }
}
