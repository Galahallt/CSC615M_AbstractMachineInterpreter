package machine;

import java.util.Arrays;
import java.util.List;

public class Memory {
    private int index;
    private String name;
    private List<String> inputs;
    private int curChar = 0;
    private int prevCharHL = 0;
    private int curCharHL = 1;

    public Memory(int id, String name, List<String> inputs) {
        this.index = id;
        this.name = name;
        this.inputs = inputs;
    }

    public int getIndex() {return index; }

    public String getName() {
        return name;
    }

    public String getMemory() {
        return String.join("", inputs);
    }
    public List<String> getMemoryList() { return inputs; }
    public int getCurChar() { return curChar; }

    public int getPrevCharHL() {
        return prevCharHL;
    }

    public int getCurCharHL() {
        return curCharHL;
    }

    public void resetMemory() {
        curChar = 0;
        prevCharHL = 0;
        curCharHL = 1;
        inputs.clear();

        if (name.startsWith("T"))
            inputs.addAll(Arrays.asList("#", "#"));

    }

    public void write(String input) {
        this.inputs.add(input);
    }

    public void stackRead() {
        if (this.inputs.size() > 0)
            this.inputs.remove(inputs.size() - 1);
    }

    public void queueRead() {
        if (this.inputs.size() > 0)
            this.inputs.remove(0);
    }

    public void updateHighlight(String command) {
        if ((command.equals("SCAN") || command.contains("RIGHT")) && curCharHL < inputs.size()) {
            // move highlight tracker to the right
            prevCharHL+=1;
            curCharHL+=1;
            curChar++;
        } else if (command.contains("LEFT") && prevCharHL > 0) {
            // move highlight tracker to the left
            prevCharHL-=1;
            curCharHL-=1;
            curChar--;
        }
    }

    @Override
    public String toString() {
        return("memArray: " + getMemory());
    }
}
