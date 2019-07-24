import domain.PoetryReader;
import domain.port.leftside.RequestVerses;
import domain.port.rightside.ObtainPoems;
import infra.ConsoleAdaptor;
import infra.ConsolePublicationStrategy;
import infra.PoetryLibraryFileAdaptor;
import infra.WriteLines;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AcceptanceTest {
    @Test
    public void should_give_verses_when_asked_for_poetry() {
        //Here the adaptor is the test it self
        RequestVerses poetryReader /* Left side port*/ = new PoetryReader()/* Hexagon */;
        var verse = poetryReader.giveMeSomePoetry();
        Assert.assertEquals("I want to sleep\r\nSwat the flies", verse);
    }

    @Test
    public void should_give_verses_when_asked_for_poetry_with_the_support_of_a_poetry_library() {
        //Need to instanciate right side port
        ObtainPoems poetryLibrary = Mockito.mock(ObtainPoems.class);
        Mockito.when(poetryLibrary.getMeAPoem()).thenReturn("I want to sleep\r\nSwat the flies2");
        var poetryReader = new PoetryReader(poetryLibrary);
        var verse = poetryReader.giveMeSomePoetry();
        Assert.assertEquals("I want to sleep\r\nSwat the flies2", verse);
    }

    @Test
    public void should_provide_verses_when_asked_for_Poetry_with_the_support_of_aConsole() {
        //1.Instanciate the right side adaptors - I want to go outside the hexagon
        ObtainPoems poetryLibrary = Mockito.mock(ObtainPoems.class);
        Mockito.when(poetryLibrary.getMeAPoem()).thenReturn("I want to sleep\r\nSwat the flies2");

        //2.Instantiate hexagon
        var poetryReader = new PoetryReader(poetryLibrary);
        var publicationStrategy = Mockito.mock(WriteLines.class);

        var consoleAdaptor = new ConsoleAdaptor(poetryReader, publicationStrategy);
        consoleAdaptor.ask();

        //3.Check that the Console.WriteLine has been called

    }

    @Test
    public void should_provide_verses_when_asked_for_Poetry_with_the_support_of_aConsole_and_console_publication_strategy() {
        //1.Instanciate the right side adaptors - I want to go outside the hexagon
        ObtainPoems poetryLibrary = Mockito.mock(ObtainPoems.class);
        Mockito.when(poetryLibrary.getMeAPoem()).thenReturn("I want to sleep\r\nSwat the flies2");

        //2.Instantiate hexagon
        var poetryReader = new PoetryReader(poetryLibrary);
        var publicationStrategy = new ConsolePublicationStrategy();

        var consoleAdaptor = new ConsoleAdaptor(poetryReader, publicationStrategy);
        consoleAdaptor.ask();

        //3.Check that the Console.WriteLine has been called

    }

    @Test
    public void should_provide_verses_when_asked_for_Poetry_with_the_support_of_aFile_adaptor() {

        var fileAdaptor = new PoetryLibraryFileAdaptor("/home/chanaka/Sources/learn/hexagonal/src/test/resources/poetry.txt");
        //2.Instantiate hexagon
        var poetryReader = new PoetryReader(fileAdaptor);
        var verses = poetryReader.giveMeSomePoetry();
        Assert.assertEquals("I want to sleep\nSwat the flies from file", verses);
    }
}