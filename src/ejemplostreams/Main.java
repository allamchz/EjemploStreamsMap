package ejemplostreams;

/**
 * Programa principal donde se aplican distintos mapeos para procesar un listado de personas
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Nacho", 42));
        listaPersonas.add(new Persona("Juan", 70));
        listaPersonas.add(new Persona("Mario", 7));
        listaPersonas.add(new Persona("Laura", 4));
        listaPersonas.add(new Persona("May", 41));

        System.out.println("Nombres de personas:");
        listaPersonas.stream()
                     .map(p -> p.getNombre())
                     .forEach(System.out::println);

        System.out.println("Personas construidas a partir de strings:");
        List<String> datosPersonas = new ArrayList<>();
        datosPersonas.add("Adrián:30");
        datosPersonas.add("Julia:45");
        datosPersonas.stream()
                     .map(s -> new Persona(s.split(":")[0], Integer.parseInt(s.split(":")[1])))
                     .forEach(System.out::println);
    }
}
