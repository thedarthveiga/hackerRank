package algorithms;

import org.junit.jupiter.api.Test;
import problemSolving.algorithms.SolveMeFirstAlgorithm;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolveMeFirstAlgorithmTest {

    private SolveMeFirstAlgorithm solveMeFirstAlgorithm;

    @Test
    public void solveMeFirstTest(){
        int result = SolveMeFirstAlgorithm.solveMeFirst(1,1);
        assertEquals(2, result);
    }




}
