package infra;

import domain.PoetryReader;

public class ConsoleAdaptor {
    private final PoetryReader poetryReader;
    private final WriteLines publicationStrategy;

    public ConsoleAdaptor(PoetryReader poetryReader, WriteLines publicationStrategy) {
        this.poetryReader = poetryReader;
        this.publicationStrategy = publicationStrategy;
    }

    public ConsoleAdaptor(PoetryReader poetryReader) {
        this(poetryReader,new ConsolePublicationStrategy());
    }

    public void ask(){
        // Adapt from the infra to the domain

        // Call the business logic
        var verses = this.poetryReader.giveMeSomePoetry();

        // Adapt from Domain to Infra
        this.publicationStrategy.writeLine(verses);
    }

}
