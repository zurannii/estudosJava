public class Main {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + "of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("take one down");
            System.out.println("pass it around");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("no more bottles of beer on the wall");
            }
        }
    }
}