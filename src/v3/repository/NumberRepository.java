package v3.repository;

public interface NumberRepository {

  //violating the abstraction principle here
  double[] read() throws NumberRepositoryException;
}