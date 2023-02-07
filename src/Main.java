import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //todo Бул бир компютердин полный характеристикасын көсөтүп берет.
        
        Computer com = new Computer(new Display(15, "Korea", "LCD"), "Samsung", "Black",
                new HardDisc(2, 3), new Ram(32, "USA"), "M2 8GB",
                new UsbPort[]{new UsbPort(3.0, 9085), new UsbPort(2.0, 9073)},
                new Keyboard("yes", "no"));
        System.out.println("Display: " + com.getDisplay() + " Marca: " + com.getMarca() + " Color: " + com.getColor()
                + "\nHard disc: " + com.getHardDisc()
                + "\nRam: " + com.getRam()
                + "\nVideo card: " + com.getVideoCart()
                + "\nUSB port: " + Arrays.toString(com.getUsbPorts())
                + "\nKeyboard backlight: " + com.getKeyboard());

    }
}