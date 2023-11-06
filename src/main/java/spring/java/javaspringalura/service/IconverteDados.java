package spring.java.javaspringalura.service;

public interface IconverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
