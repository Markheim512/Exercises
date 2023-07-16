import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        DefenceCalc defenceCalc = new DefenceCalc(10, 200, 10, 600, 10);

        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\janmu\\Documents\\DS3_defence");

            myWriter.write(defenceCalc.lineZero()+ "\n");

            for (int atk = defenceCalc.min; atk<= defenceCalc.atkMax; atk+= defenceCalc.atkIncrement) {
                myWriter.write(defenceCalc.line(atk) + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}