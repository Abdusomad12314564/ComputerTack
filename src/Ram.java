public class Ram {
    private int memory;
    private String manufacturer;

    public Ram(int memory, String manufacturer) {
        this.memory = memory;
        this.manufacturer = manufacturer;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return  memory +"GB "+
                " manufacturer: " + manufacturer;
    }
}
