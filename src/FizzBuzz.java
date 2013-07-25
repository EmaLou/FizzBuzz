
public class FizzBuzz {
    String fizzOutput;
    String buzzOutput;
    int fizzNumber;
    int buzzNumber;
    public FizzBuzz(){
        fizzOutput = "Fizz";
        buzzOutput = "Buzz";
        fizzNumber = 3;
        buzzNumber = 5;

    }
    public String answer(int input) {
        String output = "";

        if(input%fizzNumber!=0 && input%buzzNumber !=0){
            output = Integer.toString(input);
            return output;
        }
        if(input%fizzNumber==0)
            output += fizzOutput;
        if(input%buzzNumber==0)
            output += buzzOutput;
        return output;
    }
}
