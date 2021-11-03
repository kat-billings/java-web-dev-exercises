package org.launchcode.java.demos.lsn6inheritance.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.main.HouseCat;

public class catTest {
    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat testCat = new HouseCat("Test",1);
        assertEquals(1,testCat.getWeight(),.001);
    }
}
