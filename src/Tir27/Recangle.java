package Tir27;

import java.util.Scanner;

public class Recangle extends Shape {

    private int x;
    private int y;

    public Recangle(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void draw() {
        String[][] rec = new String[this.x][this.y];
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                rec[i][j] = "*";
            }
        }
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                if (i > 0 && j > 0 && i < this.x - 1 && j < this.y - 1) {
                    rec[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < rec.length; i++) {
            for (int j = 0; j < rec[i].length; j++) {
                System.out.print(rec[i][j] + " ");
            }
            System.out.println();
        }


    }
}
