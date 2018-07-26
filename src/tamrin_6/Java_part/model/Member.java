package tamrin_6.Java_part.model;

public class Member  extends Person{

    private int memberID;

    public Member(String firstName, String lastName, int memberID) {
        super(firstName, lastName);
        this.memberID = memberID;
    }

    public void getBorrowedBooks(){

    }
    public int getPenalty(){
        return 0;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

}
