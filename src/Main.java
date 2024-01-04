public class Main {

    public static int solution(int number) {
        //Initialize an acumulator
        int acum = 0;
        //Check for every integer below the inserted number
        for (int i = 0; i < number; i++) {
            if((i % 3) == 0 || (i % 5) == 0) { //If the remainder of i divided into
                acum += i;                     //3 or 5 is equal to 0, add it into
                                                //the acumulator
            }
        }
        return acum;
    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("23: "+ solution(10));


    }
}
