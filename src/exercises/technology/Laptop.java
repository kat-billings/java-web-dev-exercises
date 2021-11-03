package exercises.technology;

public class Laptop extends Computer {
    private boolean hasDisc;

    public Laptop(String aBrand, Integer aMemory) {
        super(aBrand, aMemory);
        hasDisc = false;
    }

    public boolean getHasDisc(){
        return hasDisc;
    }

    public void setHasDisc(boolean aHasDisc){
        hasDisc = aHasDisc;
    }

    public void insertDisc(){
        hasDisc = true;
    }

    public void ejectDisc(){
        hasDisc = false;
    }
}
