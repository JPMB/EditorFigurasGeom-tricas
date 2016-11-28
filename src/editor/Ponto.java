package editor;

import java.io.Serializable;

public class Ponto implements Serializable{
    int x, y;
    
    public Ponto() {
        x = y = 0;
    }
    
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
