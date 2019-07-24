package infra;

import domain.port.rightside.ObtainPoems;

public class HardCodedPoetryLibrary implements ObtainPoems {
    @Override
    public String getMeAPoem() {
        return "I want to sleep\r\nSwat the flies";
    }
}
