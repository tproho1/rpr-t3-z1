package ba.unsa.etf.rpr.tutorijal03;



public class FiksniBroj extends TelefonskiBroj {
   public enum Grad {
        BUGOJNO("030"), BUSOVACA("030"), DOBRETICI("030"), DONJIVAKUF("030"), FOJNICA("030"), GORNJIVAKUF("030"),
        JAJCE("030"), KISELJAK("030"), KREŠEVO("030"), NOVITRAVNKI("030"), TRAVNIK("030"), VITEZ("030"),
        ODŽAK("031"), SARAJEVO("033"), ZENICA("032"), LIVNO("034"), TUZLA("035"), MOSTAR("036"), BIHAC("037"),
        GORAŽDE("038");

        private String pozivni;

        Grad(String pozivni){
            this.pozivni=pozivni;
        }
        public String getPozivni(){
            return pozivni;
        }

    }
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    };

    public Grad getGrad(){
        return grad;
    }
    public void setGrad(){ this.grad=grad;}

    public String getBroj() {
        return broj;
    }
    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi()
        return getGrad().getPozivni() + "/" + broj;;
    }

    @Override
    public int hashCode() {
        return 0;
    }



}
