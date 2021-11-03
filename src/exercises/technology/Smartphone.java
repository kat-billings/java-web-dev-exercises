package exercises.technology;

public class Smartphone extends Computer {
    private String phoneNumber;

    public Smartphone(String aBrand, Integer aMemory, String aPhoneNumber) {
        super(aBrand, aMemory);
        phoneNumber = aPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String aPhoneNumber) {
        phoneNumber = aPhoneNumber;
    }

    public String makePhoneCall(String recipient){
        return "Calling " + recipient + "...";
    }
}
