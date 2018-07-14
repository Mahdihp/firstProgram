public class CompNum {
    private int realPart;
    private int imaginaryPart;

    public CompNum(int real, int imaginary) {
        realPart = real;
        imaginaryPart = imaginary;
    }

// this cannot be done:
//	public CompNum getNum() {
//		return CompNum(realPart, imaginaryPart);
//	}

    public int getNumReal() {
        return realPart;
    }

    public int getNumImag() {
        return imaginaryPart;
    }

    public static CompNum add(CompNum a, CompNum b) {
        return a.add(b);
    }

    public CompNum add(CompNum a) {
        return new CompNum(this.realPart + a.realPart, this.imaginaryPart + a.imaginaryPart);
    }

    public CompNum subtract(CompNum a) {
        return new CompNum(this.realPart - a.realPart, this.imaginaryPart - a.imaginaryPart);
    }

    public static CompNum subtract(CompNum a, CompNum b) {
        //if (a != null)
        return a != null ? a.subtract(b) : null;
    }

    public static CompNum mirror(CompNum a) {
        return new CompNum(-a.realPart, -a.imaginaryPart);
    }

    public CompNum mirror() {
        return new CompNum(-this.realPart, -this.imaginaryPart);
    }

    public boolean equals(CompNum a) {
        return a != null && this.realPart == a.realPart && this.imaginaryPart == a.imaginaryPart;
    }

    public static boolean equals(CompNum a, CompNum b) {
        return a != null && a.equals(b);
    }

    public void print() {
        System.out.println(this.realPart + "," + this.imaginaryPart + "j");
    }
}
