import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactorialTest {
  
  @Test
  public void testCalculatorFactorial(){

            //given
            Factorial factorial= new Factorial();
      
            //when
            int result = factorial.getFactorial(5);
            //assert
            assertEquals(120, result);


  }

}