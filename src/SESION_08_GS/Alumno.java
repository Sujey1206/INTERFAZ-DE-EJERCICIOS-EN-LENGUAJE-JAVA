package SESION_08_GS;
//atributos que son propios del alumno 
public class Alumno {
    
    private String cod,apnom,sexo;
    private int ep,ef,pp;//son propias de la clase no se puede usar ni con metodos
// constructor: para inicializar los valores del objeto
    public Alumno() {
    }

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

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    public float promedio(){
        return(float) ((ep+ef+pp)/3.0);
    }

    @Override
    public String toString() {
         return "Alumno{" + "cod=" + cod + ", apnom=" + apnom + ", sexo=" + sexo + ", ep=" + ep + ", ef=" + ef + ", pp=" + pp +", promedio="+promedio()+"}";       
    }
    
}

