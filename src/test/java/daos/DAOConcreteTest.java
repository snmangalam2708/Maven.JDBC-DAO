package daos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DAOConcreteTest {

    DAOConcrete daoConcrete;
//    DTOConcrete car1, car2, car3;

    @Before
    public void setUp() throws Exception {
        daoConcrete = new DAOConcrete();
//        car1 = new DTOConcrete(500, "GM", "Country",2013, "Yellow", "13XCOUNTRY");
//        car2 = new DTOConcrete(100, "Honda", "Accord", 2009, "White", "09XACCORD");
//        car3 = new DTOConcrete(200, "BMW", "X5", 2010, "Brown", "10XX5");
    }

    @Test
    public void testFindById () {
        String expected = "Car ID: 600, Make: Dodge, Model: Viper, Year: 2014, Color: Black, VIN: 14XVIPER";
        String actual = daoConcrete.findById(600).toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindAll () {
        Integer expected = 7;
        Integer actual = daoConcrete.findAll().size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCreate () {
        String expected = "Car ID: 700, Make: Toyota, Model: Corolla, Year: 2020, Color: White, VIN: 20XCOROLLA";
        DTOConcrete carToCreate = new DTOConcrete(700, "Toyota", "Corolla", 2020, "White", "20XCOROLLA");
        String actual = daoConcrete.create(carToCreate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUpdate () {
        String expected = "Car ID: 200, Make: BMW, Model: X5, Year: 1999, Color: Red, VIN: Stringer";
        DTOConcrete carToModify = new DTOConcrete(200, "BMW", "X5", 1999, "Red", "Stringer");
        String actual = daoConcrete.update(carToModify);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDelete () {
        Boolean expected = true;
        Boolean actual = daoConcrete.delete(700);
        Assert.assertEquals(expected, actual);
    }

}