package exercises.technology.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.Smartphone;
import org.junit.Test;

public class computerTest {

    @Test
    public void toggleConnectionInComputer(){
        Computer test = new Computer("Test",8);
        test.toggleConnection();
        assertTrue(test.getConnected());
    }

    @Test
    public void addMoreMemory(){
        Computer test = new Computer("Test",8);
        test.addMemory(8);
        assertEquals(16,test.getMemory(),.001);
    }

    @Test
    public void inheritanceForSmartphone(){
        Smartphone test = new Smartphone("Test",8,"816-228-4902");
        assertEquals(8,test.getMemory(),.001);
    }

    @Test
    public void testPhoneCalls(){
        Smartphone test = new Smartphone("Test",8,"228-4902");
        assertEquals("Calling Mom...",test.makePhoneCall("Mom"));
    }

    @Test
    public void testDiscToggle(){
        Laptop test = new Laptop("Test",9);
        test.insertDisc();
        assertTrue(test.getHasDisc());
    }

    @Test
    public void idNumberInheritance(){
        Computer test = new Computer("test",1);
        assertEquals(1,test.getIdNumber(),.001);
    }

}
