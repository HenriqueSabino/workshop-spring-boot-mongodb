package io.github.henriquesabino.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = -4209530000908449508L;
    
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
