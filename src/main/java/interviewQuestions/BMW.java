package interviewQuestions;

public class BMW implements  Car{
    @Override
    public void drive() {
        System.out.println("Driving the car");
    }

    public void autoPark(){
        System.out.println("Auto Parking");
    }
}
