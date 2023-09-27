package chap07.ex02;

public class StorageException extends Exception{

  public StorageException(String string, Exception e) {
    super(string, e);
  }

}
