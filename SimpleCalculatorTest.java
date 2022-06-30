import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {
    @Test

    void twoPlusTwoShouldBeEqualToFour(){
        SimpleCalculator addingNumbers = new SimpleCalculator();
        assertEquals(4, addingNumbers.add(2, 2 ));

    }
    @Test
    void TwentyOneDivideByThreeShouldBeEqualSeven(){
        SimpleCalculator dividingNumbers = new SimpleCalculator();
        assertEquals(7, dividingNumbers.division(21, 3));
    }
    @Test
    void threeTimeThreeShouldBeEqualsNine(){
        SimpleCalculator multiplyNumbers = new SimpleCalculator();
        assertEquals(9, multiplyNumbers.multiplication(3, 3));
    }

    @Test
    void twentyMinusEightShouldBeEqualSixteen(){
        SimpleCalculator subtractions = new SimpleCalculator();
        assertEquals(12, subtractions.subtractNumbers(20,8));
    }

}