package domain;

import domain.port.leftside.RequestVerses;
import domain.port.rightside.ObtainPoems;
import infra.HardCodedPoetryLibrary;

public class PoetryReader implements RequestVerses {
    private final ObtainPoems poetryLibrary;

    public PoetryReader(ObtainPoems poetryLibrary) {
        this.poetryLibrary = poetryLibrary;
    }

    public PoetryReader() {
        this(new HardCodedPoetryLibrary());
    }

    public String giveMeSomePoetry() {
        return poetryLibrary.getMeAPoem();
    }
}
