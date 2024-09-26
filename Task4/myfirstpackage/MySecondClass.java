package myfirstpackage;
public class MySecondClass {
    private int firstNumber;
    private int secondNumber;
    public MySecondClass(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public int getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(int value) {
        firstNumber = value;
    }
    public int getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(int value) {
        secondNumber = value;
    }
    public int performAction() {
        return firstNumber + secondNumber;
    }
}