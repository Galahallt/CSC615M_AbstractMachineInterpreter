package machine;

public class Rule {
    private String state;
    private String input;
    private String output;
    private String nextState;
    private String command;

    public Rule (String state,String input,String output,String nextState,String command) {
        this.state = state;
        this.input = input;
        this.output = output;
        this.nextState = nextState;
        this.command = command;
    }


    public String getState() {
        return state;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public String getNextState() {
        return nextState;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return ("\n==========================" +
                "\nState: " + this.getState() +
                "\nCommand: " + this.getCommand() +
                "\nInput: " + this.getInput() +
                "\nOutput: " + this.getOutput() +
                "\nNext State: " + this.getNextState());
    }
}
