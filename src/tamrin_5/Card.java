package tamrin_5;

import java.util.Random;

public class Card {

    private int[][] card = new int[3][5];
    ;

    public Card() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                card[i][j] = new Random(90).nextInt();
            }
        }
    }

    public int getNumber(int row, int col) {
        return card[row][col];
    }

    public int[] getNumber(int number) {
        int[] ij = new int[2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (card[i][j] == number) {
                    ij[0] = i;
                    ij[1] = j;
                }
            }
        }
        return ij;
    }

    public boolean isMarked(int row, int col) {
        boolean flag = false;
        if (card[row][col] > 0) {
//            card[row][col] = -1;
            flag = true;
        }
        return flag;
    }
    public void markNumber(int number){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (card[i][j] == number) {
                   card[i][j] = -1;
                }
            }
        }
    }
}
