import java.util.Scanner;
import data.Map;
public class Main {
    public static void newMap() {
        Map m = new Map();
        for (int i = 0; i < m.getDim1(); i++) {
            for (int j = 0; j < m.getDim2(); j++) {
                System.out.print("Enter row: ");
                Scanner myObj = new Scanner(System.in);
                int row = myObj.nextInt();

                System.out.print("Enter column: ");
                int col = myObj.nextInt();

                System.out.println("Changing: " + row + " - " + col);
                m.change_cell(row, col);

            }
        }
    }

        public static void main (String[] args){
            System.out.println("Hello world!");
            newMap();

        }
    }
