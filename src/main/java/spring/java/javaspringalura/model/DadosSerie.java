package spring.java.javaspringalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title") String titulo, @JsonAlias("TotalSeasons") String totalTemporadas, @JsonAlias("imbdRating") String avalicao ) {
    
}
