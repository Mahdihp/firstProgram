package tamrin_4;

public class BigInt extends Number {

    private int number;
    public BigInt(String numbers){
        number = Integer.parseInt(numbers);
    }
    public BigInt(int number){
        this.number = number;
    }

    @Override
    public int intValue() {
        return number;
    }

    @Override
    public long longValue() {
        return (long)number;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
