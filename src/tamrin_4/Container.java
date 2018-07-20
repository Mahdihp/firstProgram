package tamrin_4;

import java.util.Arrays;

public class Container {

    private int[] number;

    public Container(int input) {
        this.number = new int[input];
        for (int i = 0; i < this.number.length; i++) {
            number[i] = -1;
        }
    }

    public void addNumber(int number) {
        for (int i = 0; i < this.number.length; i++) {
            if (this.number[i] == -1) {
                this.number[i] = number;
                break;
            }
        }

    }

    public void sortNumber() {
        /*int temp = 0;
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }*/
        Arrays.sort(this.number);
    }

    public void showNumber() {
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= 0)
                System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public void deleteNumberByIndex(int index) {
        for (int i = 0; i < this.number.length; i++) {
            if (i == index) {
                this.number[i] = -1;
                break;
            }
        }
    }

    public void deleteNumberByValue(int value) {
        int arrNum = 0;
        for (int i = 0; i < this.number.length; i++) {
            if (this.number[i] == value) {
                this.number[i] = -1;
                break;
            }
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= 0)
                arrNum++;
        }
        int newNumber[] = new int[arrNum];
        int index =0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > -1) {
                newNumber[index] = number[i];
                index++;
            }
        }
        number = newNumber;
    }

    public int findByValue(int number) {
        int found = -1;
        for (int i = 0; i < this.number.length; i++) {
            if (this.number[i] == number) {
                found = i;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Container con = new Container(5);
        con.addNumber(5);
        con.addNumber(4);
        con.addNumber(7);
        con.addNumber(9);
        con.addNumber(3);
        con.deleteNumberByValue(7);
        con.sortNumber();
        con.showNumber();
        System.out.println(con.findByValue(5));
    }
}
