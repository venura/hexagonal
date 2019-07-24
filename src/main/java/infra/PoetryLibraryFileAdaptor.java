package infra;

import domain.port.rightside.ObtainPoems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PoetryLibraryFileAdaptor implements ObtainPoems {
    private String verse;

    public PoetryLibraryFileAdaptor(String path) {
        try {
            this.verse = Files.readString(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getMeAPoem() {
        return this.verse;
    }
}
