package SESION_08_GS;

public class Atleta_GS {
      private String cod,apnom,sexo,nacio;
      private int edad,gana;
      private float cp;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getApnom() {
        return apnom;
    }

    public void setApnom(String apnom) {
        this.apnom = apnom;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGana() {
        return gana;
    }

    public void setGana(int gana) {
        this.gana = gana;
    }

    public float getCp() {
        return cp;
    }

    public void setCp(float cp) {
        this.cp = cp;
    }
    
    public float descuento(){
         float desc = 0;
        if (gana >= 3) {
            desc = (float) (cp * 0.1);
        } else if (gana == 2) {
            desc = (float) (cp * 0.08);
        } else if (gana == 1) {
            desc = (float) (cp * 0.05);
        }
        return desc;
    }
    
    public float costo_viatico(){
        float total = 0;
        if (nacio.compareTo("Peruano (a)")==0) {
            total = (float) (cp * 0.04);
        }else if (nacio.compareTo("Mexicano (a)")==0) {
            total = (float) (cp * 0.08);
        }else if (nacio.compareTo("Etiope")==0) {
            total = (float) (cp * 0.13);
        }
        return total;
    }
    
    public float total_fin(){
        return (cp+costo_viatico() - descuento());
    }
  
      
}
