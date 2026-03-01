package org.example.similateurdecredit;

public class CreditModel {
    private double montant;
    private double taux;
    private int duree;
    private double mensualite;
// Getters and setters
   public double getmontant(){
    return montant;
   }
   public void setmontant(double montant){
   this.montant=montant;
   }
   public double gettaux(){
    return taux;
   }

   public void settaux(double taux){
   this.taux=taux;
   }

   public int getduree(){
    return duree;
   }

   public void setduree(int duree){
   this.duree=duree;
   }

   public double getmensualite(){
    return mensualite;
   }

   public void setmensualite(double mensualite){
   this.mensualite=mensualite;
   }
   public CreditModel(){
       super();
   }
   public CreditModel(double montant,double taux,int duree,double mensualite){
       super();
    this.montant=montant;
    this.taux=taux;
    this.duree=duree;
    this.mensualite=mensualite;
   }

}

