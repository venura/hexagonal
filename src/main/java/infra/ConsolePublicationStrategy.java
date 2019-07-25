package infra;

public class ConsolePublicationStrategy  implements WriteLines{
    public ConsolePublicationStrategy() {
    }

    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}
