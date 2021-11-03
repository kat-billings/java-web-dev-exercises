package exercises.technology;

public abstract class AbstractIdentity {
    public static int idNumber = 0;

    public AbstractIdentity(int idNumber) {
        AbstractIdentity.idNumber++;
    }

    public static int getIdNumber() {
        return idNumber;
    }
}
