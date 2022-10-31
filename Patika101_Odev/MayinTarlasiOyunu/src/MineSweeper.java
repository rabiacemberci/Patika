import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    String[][] mineMap;
    String[][] gameMap;
    int mineNumber;
    int a;
    int b;
    int count;
    boolean isTrue = true;


    public MineSweeper(int row, int col) {
        this.row = row;
        this.column = col;
        this.gameMap = new String[row][col];
        this.mineMap = new String[row][col];
        this.mineNumber = (row * col) / 4;

    }

    public void mineMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";

            }
        }
    }

    public void randomNumber() {
        Random r = new Random();
        for (int i = 0; i < this.mineNumber; i++) {
            int rsayi = r.nextInt(this.row);
            int rsayi2 = r.nextInt(this.column);
            if (!this.mineMap[rsayi][rsayi2].equals("*")) {
                this.mineMap[rsayi][rsayi2] = "*";
            }
        }
    }

    public void printMineMap() {
        System.out.println("Mayinlarin Konumu");
        randomNumber();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (!this.mineMap[i][j].equals("*")) {
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeliniz!");
    }

    public void printGameMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void indexSelect() {
        Scanner inp = new Scanner(System.in);
        isTrue = false;
        while (!isTrue) {
            System.out.print("Satir Giriniz : ");
            a = inp.nextInt();
            System.out.print("Sütun Giriniz : ");
            b = inp.nextInt();
            if (a > row || b > column) {
                System.out.println("Map sinirlari disinda secim yaptınız tekrar giriniz !");
                continue;
            }
            if (mineMap[a][b].equals("*")) {
                System.out.println("Game Over!");
                break;
            }
            control();
            if (finish()) {
                System.out.println("Tebrikler kazandiniz :)))))");
                break;
            }
        }
    }

    public void control() {
        count = 0;
        for (int i = (a - 1); i <= (a + 1); i++) {
            for (int j = (b - 1); j <= (b + 1); j++) {
                if (i < 0 || j < 0 || i >= this.row || j >= this.column) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }
        this.gameMap[a][b] = String.valueOf(count);
        this.mineMap[a][b] = String.valueOf(count);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public boolean finish() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
    public void run() {
        mineMap();
        printMineMap();
        indexSelect();
    }
}