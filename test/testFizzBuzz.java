import junit.framework.Assert;
import org.junit.Test;

public class testFizzBuzz {
    @Test
    public void should_return_number_when_input_normal_number(){
        FizzBuzz example = new FizzBuzz();
        Assert.assertEquals("1",example.answer(1));
    }
    @Test
    public void should_return_Fizz_when_input_multiple_of_3(){
        FizzBuzz example = new FizzBuzz();
        Assert.assertEquals(example.fizzOutput,example.answer(3));
    }
    @Test
    public void should_return_Buzz_when_input_multiple_of_5(){
        FizzBuzz example = new FizzBuzz();
        Assert.assertEquals(example.buzzOutput,example.answer(5));
    }
    @Test
    public void should_return_FizzBuzz_when_input_multiple_of_3_and_5(){
        FizzBuzz example = new FizzBuzz();
        Assert.assertEquals(example.fizzOutput+example.buzzOutput,example.answer(15));
    }
}
