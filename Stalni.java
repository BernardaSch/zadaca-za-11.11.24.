import java.math.BigDecimal;

public class Stalni extends Zaposlenik{

    public Stalni (String ime, BigDecimal osnovnaPlaca, int radniSati){
        super(ime, osnovnaPlaca, radniSati);
    }

    public BigDecimal racunanjePlace (){
        BigDecimal osnovnaPlaca = super.racunanjePlace();

        if(getRadniSati()>160){
            BigDecimal bonus = osnovnaPlaca.multiply(new BigDecimal(0.15));
            return osnovnaPlaca.add(bonus);
        }
        return osnovnaPlaca;
    }
}
