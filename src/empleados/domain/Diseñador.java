
package empleados.domain;

public class Diseñador extends Empleado{
    public Diseñador(){

    }

    public Diseñador(String nombre, String puesto, int nivel){
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setNivel(nivel);
    }

    public void desplegarInformacion(){
        System.out.println("Nombre Empleado: " + this.getNombre());
        System.out.println("Puesto: " + this.getPuesto());
        System.out.println("Nivel: " + this.getNivel());
    }

}
