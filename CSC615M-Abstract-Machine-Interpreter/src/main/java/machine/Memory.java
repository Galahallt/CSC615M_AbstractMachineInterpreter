package machine;

import java.util.List;

public class Memory {
    private String name;
    private List<String> inputs;

    public Memory(String name, List<String> inputs) {
        this.name = name;
        this.inputs = inputs;
    }

    public String getName() {
        return name;
    }

    public List<String> getMemory() {
        return inputs;
    }

    public void setMemory(List<String> inputs) {
        this.inputs = inputs;
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

    @Override
    public String toString() {
        return("memArray: " + getMemory());
    }
}
