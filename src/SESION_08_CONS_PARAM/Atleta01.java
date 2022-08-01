/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESION_08_CONS_PARAM;

public class Atleta01 {
    private String cod,nom,sex,nac;
    private double cpar;
    private int edad,marat;

    public Atleta01(String cod, String nom, String sex, String nac, double cpar, int edad, int marat) {
        this.cod = cod;
        this.nom = nom;
        this.sex = sex;
        this.nac = nac;
        this.cpar = cpar;
        this.edad = edad;
        this.marat = marat;
    }
    public double total()
    {
        return cpar+cvia()-des();
    }
    public double cvia()
    {
        if(nac.equals("Peruano")){
            return 0.04*cpar;
        }else if(nac.equals("Mexicano")){
            return 0.08*cpar;
        }else if(nac.equals("Etiope")){
            return 0.13*cpar;
        }
        return 0;
    }
    public double des()
    {
        if(marat>=3){
            return 0.10*cpar;
        }else if(marat==2){
            return 0.08*cpar;
        }else if(marat==1){
            return 0.05*cpar;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Atleta{" + "cod=" + cod + ", nom=" + nom + ", sex=" + sex + ", nac=" + nac + ", cpar=" + cpar + ", cvia=" + cvia() + ", des=" + des() + ", edad=" + edad + ", marat=" + marat + ", costo final=" + total() +'}';
    }
    
    
}
