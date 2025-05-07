public class GallonsLiter {

    public static void main(String[] args) {

        int gal;
        double lit;

        for(gal = 1; gal <= 100; gal = gal+4){
            lit = gal * 3.79;
            System.out.println(lit + " Liters = " +gal+ " Gallons");
        }
        System.out.println();
    }

}
