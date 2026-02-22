package metier;

public class CreditMetierImp implements ICreditmetier{
    @Override
    public double calculerMensualiteCredit(double capital, double taux, int duree) {
        double t=taux/12;
        double t1=capital*t;
        double t2= 1 - Math.pow(1+t,-duree);
        return t1/t2;
    }
}

