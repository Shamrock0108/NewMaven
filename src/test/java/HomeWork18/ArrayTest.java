package HomeWork18;

import HomeWrok18.ArrayMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void newSquareArrayShouldHaveSomeArea() {
        int[][] anArray = {{1,1},{2,2}};
        ArrayMethod squareArray = new ArrayMethod();
        Assertions.assertEquals(anArray, squareArray.checkArray(anArray));
    }
}
