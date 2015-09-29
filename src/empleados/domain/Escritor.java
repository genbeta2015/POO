package empleados.domain;

public class Escritor extends Empleado{

    private int tipoDeEscritura = 2; //1. Escritura a mano, 2. Escritura a computadora

    public Escritor(){

    }

    public Escritor(String nombre, String puesto, int nivel){
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setNivel(nivel);
    }

    public Escritor(String nombre, String puesto, int nivel, int tipoEscritura){
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setNivel(nivel);
        this.tipoDeEscritura = tipoEscritura;
    }

    public void desplegarInformacion(){
        System.out.println("Nombre Empleado: " + this.getNombre());
        System.out.println("Puesto: " + this.getPuesto());
        System.out.println("Nivel: " + this.getNivel());
        System.out.println("Tipo de Escritura: " + this.getTipoDeEscrituraEnTexto());
    }

    /**
     * @return the tipoDeEscritura
     */
    public int getTipoDeEscritura() {
        return tipoDeEscritura;
    }

    /**
     * @param tipoDeEscritura the tipoDeEscritura to set
     */
    public void setTipoDeEscritura(int tipoDeEscritura) {
        this.tipoDeEscritura = tipoDeEscritura;
    }

    public String getTipoDeEscrituraEnTexto(){
        if(this.tipoDeEscritura == 1){
            return "Escritura a Mano";
        }
        else if(this.tipoDeEscritura == 2){
            return "Escritura a Computadora";
        }
        else{
            return "Método de Escritura no Definido";
        }
    }
}
