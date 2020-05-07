import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfFirstNPositiveIntegersTest {

   @Test
   public void test1(){
      // : Given
      Integer input = 2;
      Integer expected = 3;

      // : When
      SumOfFirstNPositiveIntegers testSum = new SumOfFirstNPositiveIntegers();
      Integer actual = testSum.oneToNumber(input);

      // : Then
      assertEquals(expected, actual);
   }

   @Test
   public void test2(){
      // : Given
      Integer input = 4465;
      Integer expected = 94;

      // : When
      SumOfFirstNPositiveIntegers testSum = new SumOfFirstNPositiveIntegers();
      Integer actual = testSum.oneToNumber(input);

      // : Then
      assertEquals(expected, actual);
   }

   @Test
   public void test3(){
      // : Given

      // : When
      SumOfFirstNPositiveIntegers testSum = new SumOfFirstNPositiveIntegers();

      // : Then
      assertEquals(171, testSum.oneToNumber(18));
      assertEquals(9000, testSum.oneToNumber(42));
      assertEquals(99999999, testSum.oneToNumber(2425804));
   }



}
