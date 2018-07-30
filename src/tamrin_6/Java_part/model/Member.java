package tamrin_6.Java_part.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberID == member.memberID;
    }

    @Override
    public int hashCode() {

        return Objects.hash(memberID);
    }
}
