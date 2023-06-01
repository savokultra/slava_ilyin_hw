public class Calculator {

    private String agree;
    private int number;
    private int number1;
    private char sign;
    private String checkStep;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public void switchCalc() {
        switch(sign) {
            case '+':
                number += number1;
                System.out.println("Результат сложения равен: " + number);
                break;
            case '-':
                number -= number1;
                System.out.println("Результат вычитания равен: " + number);
                break;
            case '/':
                if (number1 != 0) {
                    number /= number1;
                    System.out.println("Результат вычитания равен: " + number);
                } else {
                    System.out.println("На 0 делить нельзя!");
                }
                break;
            case '*':
                number *= number1;
                System.out.println("Результат вычитания равен: " + number);
                break;
            case '^':
                int degree = number;
                while (number1 > 1) {
                    number *= degree;
                    number1--;
                }
                System.out.println("Результат возведения в степень равен: " + number);
                break;
            default:
                System.out.println("Такая математическая операция не поддерживается");
        }
    }
}
