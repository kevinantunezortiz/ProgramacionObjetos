package com.aluracursos.screenmatch.Exceptions;

public class ErrorEnConversionDeDuracionMinutosException extends RuntimeException {

    private String mensaje;
    public ErrorEnConversionDeDuracionMinutosException(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMessage() {
        return mensaje;
    }
}
