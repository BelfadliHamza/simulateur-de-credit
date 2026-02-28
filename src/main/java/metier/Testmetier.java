package metier;

public class Testmetier {
    public static void main(String[] args){
        CreditMetierImp metier = new CreditMetierImp();
        double capital=200000;
        int duree=240;
        double taux=4.5;

        double m = metier.calculerMensualiteCredit(capital,taux,duree);
        System.out.println("la mensualite est :"+m);
    }
}
