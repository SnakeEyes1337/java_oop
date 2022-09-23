package labs;

public class FirstLab {
    FirstLab();
    public void function() {
        final String consoleValue = System.console().readLine();
        final int number;
        try {
            number = Integer.parseInt(consoleValue);
            printAllNumbers(number);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private void printAllNumbers(int number){
        for(int i = number;i > number-10*6;i-=6){
            System.out.println(i);
        }
    }
}
