package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MovieController {
    private List<Movie> movies = new ArrayList<>();

    public MovieController() {
        // Inicializar la lista con datos

        movies.add(new Movie(1, "Harry Potter y la piedra filosofal", 2001, "Chris Columbus", "Fantasia, Aventuras", "El día de su cumpleaños, Harry Potter descubre que es hijo de dos conocidos hechiceros, de los que ha heredado poderes mágicos. Debe asistir a una famosa escuela de magia y hechicería, donde entabla una amistad con dos jóvenes que se convertirán en sus compañeros de aventura"));
        movies.add(new Movie(2, "Harry Potter y la cámara secreta", 2002, "Chris Columbus", "Fantasia, Aventuras", "Terminado el verano, Harry no ve la hora de abandonar la casa de sus odiosos tíos. Inesperadamente se presenta en su dormitorio Dobby, un elfo doméstico, que le anuncia que correrá un gran peligro si vuelve a Hogwarts."));
        movies.add(new Movie(3, "Harry Potter y la cámara secreta", 2004, "Alfonso Cuarón", "Fantasia, Aventuras", "El tercer año de estudios de Harry en Hogwarts se ve amenazado por la fuga de Sirius Black de la prisión de Azkaban. Al parecer, se trata de un peligroso mago que fue cómplice de Lord Voldemort y que intentará vengarse de Harry Potter."));
        movies.add(new Movie(4, "Harry Potter y la cámara secreta", 2005, "Mike Newell", "Fantasia, Aventuras", "Hogwarts se prepara para el Torneo de los Tres Magos, en el que competirán tres escuelas de hechicería. Para sorpresa de todos, Harry Potter es elegido para participar en la competencia, en la que deberá luchar contra dragones, internarse en el agua y enfrentarse a sus mayores miedos."));
        movies.add(new Movie(5, "Harry Potter y la cámara secreta", 2007, "David Yates", "Fantasia, Aventuras", "En su quinto año en Hogwarts, Harry descubre que muchos integrantes de la comunidad de magos no conocen la verdad acerca de su encuentro con Lord Voldemort."));

    }
    
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movies;
    }
    
    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

}
