public class Branch {
    private String code;
    private String city;
    private byte   rate;

    public Branch(String code, String city, byte rate) {
        this.code = code;
        this.city = city;
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public byte getRate() {
        return rate;
    }

    public void setRate(byte rate) {
        if (rate >= 1 && rate <= 3)
            this.rate = rate;
    }
}
