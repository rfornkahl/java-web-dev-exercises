package exercises.technology.test;

import org.junit.Before;
import org.junit.Test;
import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;


public class Program {
SmartPhone test_smartphone1;

@Before
    public void createSmartphoneObject1(){
    test_smartphone1 = new SmartPhone(1,1000, 2015, "HP");
}

Laptop test_laptop;

@Before
    public void createLaptopObject(){
    test_laptop = new Laptop(1,2000, 2020,"Apple");
}



    @Test
    public void laptopReplaceAfter3PlusYears(){
        test_laptop = new Laptop(1,2000, 2020,"Apple");
        assertTrue(Computer.whenToReplace(test_laptop.getYearBuilt()));
    }

    @Test
    public void laptopReplaceAfter2PlusYears(){
        test_laptop = new Laptop(1,500, 2021,"Apple");
        assertTrue(Computer.whenToReplace(test_laptop.getYearBuilt()));
    }

}
