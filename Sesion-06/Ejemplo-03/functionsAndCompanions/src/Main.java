public class Main {

    public static void main(String args[]){
        int randomNum = RandomGenerator.Companion.generate();

        System.out.println(randomNum);
        System.out.println(RandomGenerator.initialPhrase);
    }

}
