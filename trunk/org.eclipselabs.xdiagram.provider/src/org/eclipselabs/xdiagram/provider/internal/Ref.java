
//In Java there is nothing at language level similar to ref. In Java there is only passing by value semantic
//For primitives you get a copy of the value, For all other you get a copy of the reference and this is called also passing by value.
//For the sake of curiosity you can implement a ref-like semantic in Java simply wrapping your objects in a mutable class:

package org.eclipselabs.xdiagram.provider.internal;

public class Ref<T> {

    private T value;

    public Ref(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T anotherValue) {
        value = anotherValue;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

//pass an int variable as reference you can wrap it in a mutable class, for example an int array:
//void findsum( int no1, int no2, int[] sum )
//{
//  sum[0] = no1 + no2;
//}

//AtomicReference<Object> ref = new AtomicReference<Object>("Hello");
//mutate(ref);
//System.out.println(ref.get()); //Goodbye!
//
//private void mutate(AtomicReference<Object> ref) { ref.set("Goodbye"); }

//testcase:
//
//public void changeRef(Ref<String> ref) {
//    ref.set("bbb");
//}
//
//// ...
//Ref<String> ref = new Ref<String>("aaa");
//changeRef(ref);
//System.out.println(ref); // prints "bbb"

