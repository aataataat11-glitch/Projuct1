package myfirstproject;

import java.util.Stack;

public class ActionStack {
    private Stack<String> actions = new Stack<>();

    public void pushAction(String action) {
        actions.push(action);
    }

    public void popAction() {
        if (!actions.isEmpty()) {
            System.out.println("Undo: " + actions.pop());
        }
    }
}
