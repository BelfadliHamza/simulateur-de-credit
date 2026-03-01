package org.example.similateurdecredit;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.CreditMetierImp;
import metier.ICreditmetier;

public class ControleurServlet extends HttpServlet{
    private ICreditmetier metier;
    @Override
    public void init() throws ServletException {
        metier = new CreditMetierImp();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("CreditModel", new CreditModel());
        request.getRequestDispatcher("VueCredit.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        * Récupération des paramètres
         */
        double montant = Double.parseDouble(request.getParameter("montant"));
        double taux = Double.parseDouble(request.getParameter("taux"));
        int duree = Integer.parseInt(request.getParameter("duree"));
        /*
        * stocker les données dans le model
         */
        CreditModel model = new CreditModel();
        model.setmontant(montant);
        model.settaux(taux);
        model.setduree(duree);
        /*
        * faire appel a la couche metier pour effectuer le traitement
         */

        double res = metier.calculerMensualiteCredit(montant,taux,duree);
        /*
        *stocker le resultat dans le model
         */
        model.setmensualite(res);
        /*
        *stocker le model dans l'objet request
         */
        request.setAttribute("CreditModel", model);

        /*
        *faire un forword vers la vue
         */

        request.getRequestDispatcher("VueCredit.jsp").forward(request, response);

    }
}