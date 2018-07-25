package mordad_3_abstract_interface;

import java.util.Date;

public interface Person {

    Date birthDate();

    default int getAge() {
        Date date = new Date();
        long miliSeconds = date.getTime() - birthDate().getTime();
        return (int) miliSeconds / 1000 / 3600 / 24 / 365;
    }
}
