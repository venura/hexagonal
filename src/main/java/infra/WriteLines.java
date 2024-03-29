package infra;

//This comes under infra because this is a trick to make ports and adapter testable therefore its not going under ports
public interface WriteLines {
    void writeLine(String verses);
}
