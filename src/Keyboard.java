public class Keyboard {
    private String backlight;
    private String numbers;

    public Keyboard(String backlight, String numbers) {
        this.backlight = backlight;
        this.numbers = numbers;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return backlight + " keyboard numbers: " + numbers;
    }
}
