public class HardDisc {
    private int memory;
    private int disc;

    public HardDisc(int memory, int disc) {
        this.memory = memory;
        this.disc = disc;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    @Override
    public String toString() {
        return " memory: " + memory +"TB "+
                " Local disc: " + disc;
    }
}
