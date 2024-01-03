package org.example.logica;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    public static void main(String[] args) {
        List<Videojuego> listaJuegos = new ArrayList<Videojuego>();

        Videojuego juego1 = new Videojuego(123, "Banjo Kazooie", "Nintendo 64",
                                            4, "Plataforma");
        Videojuego juego2 = new Videojuego(567, "Mario Party 3", "Nintendo 64",
                4, "Plataforma");
        Videojuego juego3 = new Videojuego(119, "Age Of Empire II", "PC",
                1, "Estrategia");
        Videojuego juego4 = new Videojuego(132, "Counter Strike 1.6", "PC",
                1, "Shooter");
        Videojuego juego5 = new Videojuego(233, "Mario Kart 64", "Nintendo 64",
                2, "Plataforma");

        listaJuegos.add(juego1);
        listaJuegos.add(juego2);
        listaJuegos.add(juego3);
        listaJuegos.add(juego4);
        listaJuegos.add(juego5);

        for(Videojuego games:listaJuegos){
            System.out.println("Titulo: "+ games.getTitulo() + " - Consola: " + games.getConsola() + " - Cant. Jugadores: "+ games.getCantidadJugadores() );
        }
        juego1.setTitulo("Banjo Kazooie II");
        juego1.setCantidadJugadores(1);

        juego5.setTitulo("Super Mario Kart 64");
        juego5.setCantidadJugadores(4);

        System.out.println("--------------------------");

        for(Videojuego gamesNintendo:listaJuegos){
            if(gamesNintendo.getConsola().equals("Nintendo 64")){
                System.out.println(gamesNintendo.toString());
            }
        }

    }
}