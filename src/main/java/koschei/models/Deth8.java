package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    private Needle7 needle7;

    @Autowired
    public Deth8(Needle7 needle7){ this.needle7 = needle7; }

    @Override
    public String toString() {
        return ", Умерла утра " +  needle7.toString() ;
    }
}


