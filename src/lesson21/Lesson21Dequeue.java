package lesson21;

import java.util.*;

public class Lesson21Dequeue {

    public  static  void main(String[] args) {

        Deque<String> myDeque = new ArrayDeque<String>();

        myDeque.addFirst("1");
        myDeque.addFirst("2");
        myDeque.addFirst("3");

        // get number 3
        String removedElement = myDeque.removeFirst();  // 3
        System.out.println(removedElement);

        // get number 2
        removedElement = myDeque.removeFirst();
        System.out.println(removedElement);

//        // get number 1
//        removedElement = myDeque.removeFirst();
//        System.out.println(removedElement);

        // now adding 4 on top
        myDeque.addFirst("4");

        removedElement = myDeque.removeLast();   // 1
        System.out.println(removedElement);

        // for objects hashtag and equals() are mandatory to use iterator
        List<CustomObject> myList =  new ArrayList<>();
        CustomObject obj = new CustomObject();
        obj.id = 1;

        CustomObject obj2 = new CustomObject();
        obj.id = 2;

        myList.add(obj);
        myList.add(obj2);

        Iterator myListIterator = myList.iterator();
        while (myListIterator.hasNext()) {
            System.out.println(myListIterator.next());
        }

        // equals() method used
        String pet1 = new String("parrot");
        String pet2 = new String("parrot");
        //String pet3 = pet1;

        if (pet1 == pet2) {
            System.out.println("True");
        }
        // the same as
        if (pet1.equals(pet2)) {

        }


    }
}

// for objects hashtag and equals() are mandatory
class CustomObject{
    String customField;
    int customInt;
    int id;

    public CustomObject() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomObject that = (CustomObject) o;
        return customInt == that.customInt && id == that.id && Objects.equals(customField, that.customField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, customInt, id);
    }
}
