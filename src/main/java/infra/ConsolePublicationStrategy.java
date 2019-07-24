package infra;

public class ConsolePublicationStrategy  implements WriteLines{
    public ConsolePublicationStrategy() {
    }

    @Override
    public void writeLine(String verses) {
        System.out.println(verses);
    }
}
