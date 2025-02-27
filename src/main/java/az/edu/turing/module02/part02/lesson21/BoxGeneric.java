package az.edu.turing.module02.part02.lesson21;

public class BoxGeneric<T > {

    private T item;

    // Element təyin etmək üçün konstruktor
    public BoxGeneric(T item) {
        this.item = item;
    }

    // Elementi qaytarır
    public T getItem() {
        return item;
    }

    // Elementi dəyişir
    public void setItem(T item) {
        this.item = item;
    }

    // Wildcard ilə element yazdıran metod
    public static void printBox(BoxGeneric<? super Integer> box) {
        System.out.println("Box contains: " + box.getItem());
    }


}
