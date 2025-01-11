package az.edu.turing.module02.part01.lesson16;

import java.util.Objects;

public class Animal {
    private String kind;

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(kind, animal.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kind);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                '}';
    }
}
