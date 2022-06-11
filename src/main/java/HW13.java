import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW13 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        {
            int[] company = new int[7];
            for (int i = 0; i < company.length; i++) {
                company[i] = ((int) (Math.random() * 9));
            }
            System.out.println("Welcome in loto zabava");
            int[] player = new int[7];
            for (int i = 0; i < player.length; i++) {
                System.out.println("input yor " + i + " number: ");
                player[i] = Integer.parseInt(READER.readLine());


            }

            System.out.println("Company numbers: " + Arrays.toString(company));
            System.out.println("Player numbers: " + Arrays.toString(player));

            Arrays.sort(company);
            Arrays.sort(player);
            System.out.println("Company sort numbers: " + Arrays.toString(company));
            System.out.println("Player sort numbers: " + Arrays.toString(player));

            int coincidences = 0;
            for (int i = 0; i < company.length; i++) {
                if (company[i] == player[i]) coincidences++;
            }
            System.out.println("Coincidences: " + coincidences);

        }
    }
}
