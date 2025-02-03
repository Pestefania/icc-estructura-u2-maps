import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import java.util.Arrays;
import models.Empleado;

public class App {
    public static void main(String[] args) {
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();

        //runLinkedHashMapa();
        //runTreeMapa(); // El tree map termina siendo el diccionario de la vida real, ordena alfabéticamente y en orden ascendente
    }

      //private static void runLinkedHashMapa() {
        //new Mapa().LinkedHashMapa();
       //}

        //private static void runTreeMapa() {
       // new Mapa().TreeMapa();
         //}

    private static void runEmpleadoExample() {
        EmpleadoContoller emCtrl = new EmpleadoContoller();
        boolean result = emCtrl.addEmpleado(new Empleado(1, "Cristina", "Estudiante"));
        System.out.println("\nIngreso " + result);
        result = emCtrl.addEmpleado(new Empleado(2, "Denisse", "Estudiante"));
        System.out.println("Ingreso " + result);
        
        // Obtener empleado por ID
        Empleado empleado = emCtrl.getEmpleadoById(1);
        System.out.println("Empleado encontrado: " + empleado);
        
        // Mostrar todos los empleados
        System.out.println("Lista de empleados:");
        emCtrl.displayEmpleados();

        // Mostrar empleados solo por nombres
        System.out.println("Lista de empleados solo por nombres:");
        emCtrl.displayEmpleadosSoloNombres();

        // Mostrar solo las llaves
        System.out.println("Lista de llaves de empleados:");
        emCtrl.displayLlaves();

        // Mostrar solo los valores
        System.out.println("Lista de empleados (valores):");
        emCtrl.displayValues();
    }

       //private static void runMapExample() {
        //new Mapa();
     // }

    private static void runEjercicios() {
        System.out.println("Ejecutando ejercicios...");

        // Pruebas del método areAnagrams
        System.out.println("¿Son anagramas 'listen' y 'silent'? " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("¿Son anagramas 'hello' y 'bello'? " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("¿Son anagramas 'triangle' y 'integral'? " + Ejercicios.areAnagrams("triangle", "integral"));
        System.out.println("¿Son anagramas 'apple' y 'pale'? " + Ejercicios.areAnagrams("apple", "pale"));

        // Pruebas del método sumatoriaDeDos
        Ejercicios ejercicios = new Ejercicios();
    
        int[] nums1 = {9, 2, 3, 6};
        int objetivo1 = 5;
        int[] resultado1 = ejercicios.sumatoriaDeDos(nums1, objetivo1);
        System.out.println("Índices de la suma " + objetivo1 + " en " + Arrays.toString(nums1) + ": " + (resultado1 != null ? Arrays.toString(resultado1) : "null"));

        int[] nums2 = {9, 2, 3, 6};
        int objetivo2 = 10;
        int[] resultado2 = ejercicios.sumatoriaDeDos(nums2, objetivo2);
        System.out.println("Índices de la suma " + objetivo2 + " en " + Arrays.toString(nums2) + ": " + (resultado2 != null ? Arrays.toString(resultado2) : "null"));

        int[] nums3 = {1, 4, 5, 7};
        int objetivo3 = 9;
        int[] resultado3 = ejercicios.sumatoriaDeDos(nums3, objetivo3);
        System.out.println("Índices de la suma " + objetivo3 + " en " + Arrays.toString(nums3) + ": " + (resultado3 != null ? Arrays.toString(resultado3) : "null"));
    }
}
