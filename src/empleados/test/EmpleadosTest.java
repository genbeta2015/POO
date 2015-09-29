package empleados.test;

import empleados.domain.*;

public class EmpleadosTest {
    public static void main(String args[]){

        Editor editor = new Editor("Miriam Rosas", "Editor Jr", 1);
        Diseñador diseñador = new Diseñador("Alex Toscano", "Diseñador Sr", 0);
        Escritor escritor = new Escritor("Blanca Garrido", "Escritor", 0, 1);
        Gerente gerente = new Gerente("Miguel Lopez", "Gerente Operaciones", 2,"Mercadotecnia");

        editor.desplegarInformacion();
        System.out.println("******");
        diseñador.desplegarInformacion();
        System.out.println("******");
        escritor.desplegarInformacion();
        System.out.println("******");
        gerente.desplegarInformacion();
        System.out.println("******");
        
    }

}
