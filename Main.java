import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Zaposlenik> listaZaposlenika = new ArrayList<>();

        System.out.println("******* Unos podataka o zaposlenicima. Za kraj pritisnite 0. **********");

       while(true){
           System.out.println("Unesite ime i prezime zaposlenika: ");
           String ime = scanner.nextLine();

           if (ime.equals("0")) {
               break;
           }

           System.out.println("Unesite cijenu rada po satu: ");
           BigDecimal osnovnaPlaca = scanner.nextBigDecimal();

           System.out.println("Unesite broj odrađenih sati: ");
           int radniSati = scanner.nextInt();

           System.out.println("Unesite broj 1 ako je stalni zaposlenik, ili broj 2 ako je sezonski zaposlenik: ");
           int unos = scanner.nextInt();
           scanner.nextLine();

           Zaposlenik zaposlenik = null;

           if (unos == 1){
               zaposlenik = new Stalni(ime, osnovnaPlaca, radniSati);
           }
           else if (unos == 2) {
               zaposlenik = new Sezonski(ime, osnovnaPlaca, radniSati);
           }
           else {
               System.out.println("Niste unijeli dobar odabir.");
           }

           if (zaposlenik != null){
               listaZaposlenika.add(zaposlenik);
           }
       }

       System.out.println("******* ZAPOSLENICI: *********");
       for (Zaposlenik zap : listaZaposlenika){
           zap.ispisPodatakaOZaposleniku();
           System.out.println();
       }
    }
}