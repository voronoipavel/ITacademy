package oop.lessons_23;

import java.util.Objects;

public class Multiple {
    Integer a;
    Integer b;


    public Multiple(int a, int b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Multiple) {
            if (this.a * this.b == 100){
                return true;
            }
        }
        return false;

    }

}
