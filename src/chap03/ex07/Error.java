package chap03.ex07;

public enum Error {
    OK, 
    INVALID, 
    NO_SUCH, 
    LOCKED, 
    OUT_OF_RESOURCES, 
    WATTING_FOR_EVENT;
}
interface OtherError {
  String OK = "OK";
  String INVALID = "INVALID";
  String NO_SUCH = "NO_SUCH";
  String LOCKED = "LOCKED";
  String OUT_OF_RESOURCES = "OUT_OF_RESOURCES";
  String WATTING_FOR_EVENT = "WATTING_FOR_EVENT";
}
