package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashSet;
import java.util.Set;
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

public class Imenik extends TelefonskiBroj {
        private String ime;
        private TelefonskiBroj broj;

    public void dodaj(String ime1, TelefonskiBroj broj1){this.ime=ime1; this.broj=broj1;}
    public String dajBroj(String ime1){return ime1;}
    //vraća telefonski broj osobe pod imenom ime u formi stringa pozivajući metodu ispisi() klase TelefonskiBroj,
    public String dajIme(TelefonskiBroj broj1){return ime;}
    //vraća ime osobe čiji telefonski broj je broj - i ova operacija treba koristiti HashMapu,
    public String naSlovo(char s){return " ";}
    // vraća sve brojeve u telefonskom imeniku za osobe čije ime počinje na slovo s u formatu:
            /*1. Ime Prezime - broj
            2. Ime Prezime - broj
            …*/
    //Set<String> izGrada(Grad g);
    //vraća skup Stringova koji sadrži imena i prezimena svih
    // osoba koje žive u gradu g (istog pobrojanog tipa koji je dat u klasi FiksniBroj),
    // što se može saznati ako osoba ima fiksni broj telefona u tom gradu. Pri tome skup treba biti sortiran abecedno.
    //Set<TelefonskiBroj> izGradaBrojevi(Grad g);
    //vraća brojeve za osobe iz grada g. Ovaj skup treba biti sortiran po stringu koji se dobije metodom ispisi().


    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Set<String> izGrada(Grad sarajevo) { return new HashSet<String>();
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad sarajevo) { return new HashSet<TelefonskiBroj>();
    }
}
