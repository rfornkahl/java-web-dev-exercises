package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class testInhertiance {

    @org.junit.Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }


}
