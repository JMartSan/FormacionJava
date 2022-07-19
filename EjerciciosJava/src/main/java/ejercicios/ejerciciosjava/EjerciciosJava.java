package ejercicios.ejerciciosjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jmartinezsanc
 */
public class EjerciciosJava {

    public static void main(String[] args) {
        int i;
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);

        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add( new Pelicula(1, "Soy leyenda", "Suspense", 8, 18));
        peliculas.add( new Pelicula(2, "Padre no hay mas que uno", "Comedia", 6, 0));
        peliculas.add( new Pelicula(3, "La monja", "Terror", 9, 18));
        peliculas.add( new Pelicula(4, "Los minions", "Comedia", 10, 3));
        peliculas.add( new Pelicula(5, "Toy Story", "Animacion", 5, 0));
        
        while (seguir == true) {
            //Menu
            System.out.println("Por favor, seleccione una de las opciones disponibles\n"
                    + "1. Imprimir todas las peliculas por pantalla\n"
                    + "2. Imprimir el titulo, genero y valoracion de las peliculas\n"
                    + "3. Cambiar el nombre y las valoraciones de dos peliculas y mostra por pantalla los cambios\n"
                    + "4. Imprimir por pantalla las peliculas de terror\n"
                    + "5. Salir del programa");

            int opcion = sc.nextInt();

            if (opcion == 1) {
                peliculas.forEach((peli) -> {
                    //Esto de aqui, se que es extra a lo que demandaba el ejercicio inicialmente, 
                    //pero lo he añadido para comprobaciones propias
                    
                    //Imprimir las peliculas por pantalla(Con todos los datos)
                    System.out.println(peli);
                });

            } else if (opcion == 2) {
                peliculas.forEach((peli) -> {
                    //Imprimir las el titulo, el genero y la valoracion.
                    System.out.println("Titulo: " + peli.getTitulo() + ", Genero: " + peli.getGenero() + ", Valoracion: " + peli.getValoracion());
                });
            } else if (opcion == 3) {
                //Cambiar el nombre y la valoracion de dos peliculas y mostrar por pantalla cada pelicula.
                peliculas.get(2).setTitulo("Expediente Warren");
                peliculas.get(2).setValoracion(4);

                peliculas.get(3).setTitulo("Gru, mi villano favorito");
                peliculas.get(3).setValoracion(9);

                peliculas.forEach((peli) -> {
                    System.out.println(peli);
                    
                });

            } else if (opcion == 4) {
                peliculas.forEach((peli) -> {
                    //Filtrado de genero Terror.
                    if (peli.toString().contains("Terror") || peli.toString().contains("terror")) {
                        System.out.println(peli);
                    }
                });
            } else if (opcion == 5) {
                System.out.println("Programa finalizado");
                seguir = false;

            }

        }
    }

}
