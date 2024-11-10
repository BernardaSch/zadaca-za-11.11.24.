import java.math.BigDecimal;

public class Zaposlenik {

    private String ime;
    private BigDecimal osnovnaPlaca;
    private int radniSati;

    public Zaposlenik(String ime, BigDecimal placa, int radniSati) {
        this.ime = ime;
        this.osnovnaPlaca = placa;
        this.radniSati = radniSati;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getRadniSati() {
        return this.radniSati;
    }

    public void setRadniSati(int radniSati) {
        this.radniSati = radniSati;
    }

    public BigDecimal getOsnovnaPlaca() {
        return this.osnovnaPlaca;
    }

    public void setOsnovnaPlaca(BigDecimal placa) {
        this.osnovnaPlaca = placa;
    }


    public BigDecimal racunanjePlace (){
        BigDecimal sati = new BigDecimal(radniSati);
        return osnovnaPlaca.multiply(sati);
    }

    public void ispisPodatakaOZaposleniku (){
        System.out.println("Ime zaposlenika: " + ime);
        System.out.println("Osnovna plaća: " + osnovnaPlaca);
        System.out.println("Broj radni sati: " + radniSati);
        System.out.println("Ukupna plaća: " + racunanjePlace());
    }
}
