/**
 * Created by athena2651cn on 13-12-18.
 */
public class main {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Marsaille","France",123456789);
        Ville ville2 = new Ville("Lyon","France",12345678);
        System.out.println(ville2.comparer(ville1));
        System.out.println(ville2.decrisToi());
    }
}
