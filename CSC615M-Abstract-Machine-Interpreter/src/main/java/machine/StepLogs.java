package machine;

public class StepLogs {
    private int Step;
    private String input;
    private String output;
    private String prevState;
    private String nextState;
    private String command;

    public StepLogs(String input, String output, String prevState, String nextState, String command) {
        this.input = input;
        this.output = output;
        this.prevState = prevState;
        this.nextState = nextState;
        this.command = command;
    }

    public int getStep() {
        return Step;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public String getPrevState() {
        return prevState;
    }

    public String getNextState() {
        return nextState;
    }

    public String getCommand() {
        return command;
    }

    public void setStep(int step) {
        Step = step;
    }
}
