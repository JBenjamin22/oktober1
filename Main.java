public class Main {
public static void main(String[] args) {
// Írasd ki a számokat 1-től 50-ig (mindkét szám beleértve).
for (int i = 1; i <= 50; i++) {
    if(i % 3 == 0 && i % 5 == 0)
    {
        System.out.println("FizzBuzz");
    }
    if(i % 3 == 0)
    {
        System.out.println("Fizz");
    }
     if(i % 5 == 0)
    {
        System.out.println("Buzz");
    }
}
}
}