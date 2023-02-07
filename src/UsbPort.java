public class UsbPort {
    private double typPort;
    private int id;

    public UsbPort(double typPort, int id) {
        this.typPort = typPort;
        this.id = id;
    }

    public double getTypPort() {
        return typPort;
    }

    public void setTypPort(double typPort) {
        this.typPort = typPort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return typPort + " id: " + id;
    }
}
