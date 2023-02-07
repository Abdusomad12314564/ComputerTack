public class Computer {
    private Display display;
    private String marca;
    private String color;
    private HardDisc hardDisc;
    private Ram ram;
    private String videoCart;
    private UsbPort [] usbPorts;
    private Keyboard keyboard;

    public Computer(Display display, String marca, String color, HardDisc hardDisc, Ram ram, String videoCart, UsbPort[] usbPorts, Keyboard keyboard) {
        this.display = display;
        this.marca = marca;
        this.color = color;
        this.hardDisc = hardDisc;
        this.ram = ram;
        this.videoCart = videoCart;
        this.usbPorts = usbPorts;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getVideoCart() {
        return videoCart;
    }

    public void setVideoCart(String videoCart) {
        this.videoCart = videoCart;
    }

    public UsbPort[] getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(UsbPort[] usbPorts) {
        this.usbPorts = usbPorts;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
