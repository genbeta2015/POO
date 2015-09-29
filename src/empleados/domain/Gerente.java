
package empleados.domain;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(){}

    public Gerente(String nombre, String puesto, int nivel, String depto){
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setNivel(nivel);
        this.departamento = depto;
    }

    public void desplegarInformacion(){
        System.out.println("Nombre Empleado: " + this.getNombre());
        System.out.println("Puesto: " + this.getPuesto());
        System.out.println("Nivel: " + this.getNivel());
        System.out.println("Departamento: " + this.departamento);
    }

}
