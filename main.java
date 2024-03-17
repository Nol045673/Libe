import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        try {
            Scanner input = new Scanner(System.in);

            File file = new File("input.txt");

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String[] line = input.nextLine().split(" ");
                if (line[1].equals("+")){
                    System.out.println(Integer.parseInt(line[0]) + Integer.parseInt(line[2]));
                }
                else if (line[1].equals("-")){
                    System.out.println(Integer.parseInt(line[0]) - Integer.parseInt(line[2]));
                }
                else if (line[1].equals("/")){
                    if (line[2].equals("0")){
                        System.out.println("ne delim na nol");
                        break;
                    }
                    System.out.println(Integer.parseInt(line[0]) / Integer.parseInt(line[2]));
                }
                else if (line[1].equals("*")){
                    System.out.println(Integer.parseInt(line[0]) * Integer.parseInt(line[2]));
                }
                else {
                    System.out.println("fignya");
                }
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
