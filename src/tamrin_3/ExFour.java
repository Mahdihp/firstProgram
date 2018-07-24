package tamrin_3;

public class ExFour {
    public static void main(String[] args) {
//        System.out.println(new Rational().makhrajMostarak(3, 2));
    }

  /*  class Rational {
        private int x = 0;
        private int y = 1;

        public Rational(int x, int y) {
            this.x = x / 1;
            this.y = y / 2;
        }

        public Rational add(Rational num) {
            if (this.y == num.y) {
                return new Rational(num.x + this.x, this.y);
            } else {

            }

        }

        public Rational sub(Rational num) {
            if (this.y == num.y) {
                return new Rational(num.x - this.x, this.y);
            } else {

            }
        }

        public Rational mul(Rational num) {
            return new Rational(0, num.y - this.y);
        }

        public Rational div(Rational num) {
            return new Rational(0, num.y - this.y);
        }

        public int makhrajMostarak(int n1, int n2) {
            int lcm;

            // maximum number between n1 and n2 is stored in lcm
            lcm = (n1 > n2) ? n1 : n2;

            // Always true
            while (true) {
                if (lcm % n1 == 0 && lcm % n2 == 0) {
                    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                    break;
                }
                ++lcm;
            }
            return lcm;
        }

    }
*/
    /*public static double toFloatingPoint(Rational num) {
        int teeny = num.y * (num.y * 111);
        int teenx = num.x * (num.y * 111);
        return 0.0;
    }*/


}
