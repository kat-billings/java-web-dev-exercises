package exercises.technology;

public class Computer extends AbstractIdentity {
    private String brand;
    private Integer memory;
    private Boolean isConnected;


    public Computer(String aBrand, Integer aMemory) {
        super(idNumber);
        brand = aBrand;
        memory = aMemory;
        isConnected = false;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Boolean getConnected() {
        return isConnected;
    }

    public void setConnected(Boolean connected) {
        isConnected = connected;
    }

    public void toggleConnection(){
        isConnected = !isConnected;
    }

    public void addMemory(int newMemory){
        memory += newMemory;
    }
}
