import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getSum() {
        double a =5;
        double b =25;
        //	Checks the sum of two (2) positive values
        assertEquals(30, (Calculator.getSum(a,b)));
        assertEquals(30, (Calculator.getSum(b,a)));

        a = -55;
        b = 100;
        //	Checks the sum of a postive value and a negative value
        assertEquals(45, (Calculator.getSum(a,b)));
        assertEquals(45, (Calculator.getSum(b,a)));

        a = -47;
        b = -803;
        //	Checks the sum of two (2) negative values
        assertEquals(-850, (Calculator.getSum(a,b)));
        assertEquals(-850, (Calculator.getSum(b,a)));
    }

    @Test
    void getDif() {
        double a = 27;
        double b = 30;
        //	Checks if b is lesser than a
        assertEquals(-3, (Calculator.getDif(a,b)));
        //	Checks if b is greater than a
        assertEquals(3, (Calculator.getDif(b,a)));

        a = 22.5;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(26.5, (Calculator.getDif(a,b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-26.5, (Calculator.getDif(b,a)));

        a = -227.27;
        b = -27.27;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-200, (Calculator.getDif(a,b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(200, (Calculator.getDif(b,a)));
    }

    @Test
    void getProduct() {
        double a = 10;
        double b = 5;
        //	Checks the product in case of two positive values
        assertEquals(50, (Calculator.getProduct(a,b)),0);
        assertEquals(50, (Calculator.getProduct(b,a)),0);

        a = -5.5;
        b = 10;
        //	Checks the product in case of a positive value and a negative value
        assertEquals(-55, (Calculator.getProduct(a,b)),0);
        assertEquals(-55, (Calculator.getProduct(b,a)),0);

        a = -33.5;
        b = -2.5;
        //	Checks the product in case of two negative values
        assertEquals(83.75, (Calculator.getProduct(a,b)),0);
        assertEquals(83.75, (Calculator.getProduct(b,a)),0);
    }

    @Test
    void getDivided() {
        double a = 10;	double b = 5;
        //	Checks if b is lesser than a
        assertEquals(2, (Calculator.getDivided(a,b)),0);
        //	Checks if b is greater than a
        assertEquals(0.5, (Calculator.getDivided(b,a)),0);

        a = 9;	b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (Calculator.getDivided(a,b)),0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0.33, (Calculator.getDivided(b,a)),0.007);

        a = -10;	b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2, (Calculator.getDivided(a,b)),0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.5, (Calculator.getDivided(b,a)),0);
    }
    public void testThrowException(){

        try {

            Calculator.getSum(2, 1);
            Calculator.getDif(3, 3);
            Calculator.getProduct(0, 1);
            Calculator.getDivided(1, 0);
            new Calculator();

        } catch (Exception e) {
            fail();
        }
        catch (Error e) {
            fail();
        }
    }
}