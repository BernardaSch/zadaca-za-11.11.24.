import java.math.BigDecimal;

public class Sezonski extends Zaposlenik {

    public Sezonski (String ime, BigDecimal osnovnaPlaca, int radniSati){
        super(ime, osnovnaPlaca, radniSati);
    }

    public BigDecimal racunanjePlace (){
        BigDecimal osnovnaPlaca = super.racunanjePlace();

        if (getRadniSati() > 200) {
            BigDecimal bonus = osnovnaPlaca.multiply(new BigDecimal(0.10));
            return osnovnaPlaca.add(bonus);
        }
        return osnovnaPlaca;
    }
}
