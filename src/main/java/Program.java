import domain.PoetryReader;
import domain.port.rightside.ObtainPoems;
import infra.ConsoleAdaptor;
import infra.PoetryLibraryFileAdaptor;
import org.mockito.Mockito;

public class Program {
    public static void main(String[] args) {
//Mocked poetry library
//        ObtainPoems poetryLibrary = Mockito.mock(ObtainPoems.class);
//        Mockito.when(poetryLibrary.getMeAPoem()).thenReturn("I want to sleep\r\nSwat the flies 666");
//        var poetryReader = new PoetryReader(poetryLibrary);

//Read from file adaptor
//        var fileAdaptor = new PoetryLibraryFileAdaptor("~/Sources/learn/hexagonal/src/test/resources/poetry.txt");
//        var poetryReader = new PoetryReader(fileAdaptor);

//Default poetry library( which is hard coded ) is used when not passing arg to poetry reader
        var poetryReader = new PoetryReader();

        var consoleAdapter = new ConsoleAdaptor(poetryReader);

        consoleAdapter.ask();
    }
}
