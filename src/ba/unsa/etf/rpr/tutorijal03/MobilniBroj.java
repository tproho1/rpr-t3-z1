package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza1, String broj1) {
        this.mobilnaMreza=mobilnaMreza1;
        this.broj=broj1;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" +broj;
    }
}