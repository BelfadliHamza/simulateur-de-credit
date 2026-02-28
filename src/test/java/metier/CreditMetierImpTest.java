package metier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditMetierImpTest {

    private ICreditmetier metier;

    @BeforeEach
    void setUp() {
        metier = new CreditMetierImp();
    }

    @Test
    void calculerMensualiteCredit() {
        double capital = 200000;
        double taux = 4.5;
        int duree = 240;

        double resAttendu =1265.2987;

        double rescalcule = metier.calculerMensualiteCredit( capital, taux, duree);
        assertEquals(resAttendu,rescalcule,0.0001);

    }
}