package SESION_08_GS;

public class Cliente {
    private String cod,apenom,nivel,distrito,sexo;
    private int edad;
    private float ingr,consumo;

    public Cliente() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getApenom() {
        return apenom;
    }

    public void setApenom(String apenom) {
        this.apenom = apenom;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getIngr() {
        return ingr;
    }

    public void setIngr(float ingr) {
        this.ingr = ingr;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod=" + cod + ", apnom=" + apenom + ", sexo=" + sexo + ", edad=" + edad + ", nivel=" + nivel + ", distrito=" + distrito +", ingreso="+ingr+", consumo="+consumo+"}";  
    }
    
}
