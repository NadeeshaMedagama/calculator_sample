package v3.repository;

public class NumberRepositoryException extends Exception{

  public NumberRepositoryException(String message) {
    super(message);
  }

  public NumberRepositoryException(String message, Exception e){
    super(message, e);
  }

}
