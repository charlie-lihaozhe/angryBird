package angrybird.util.iterator;

import angrybird.util.pets.*;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public void simpleIteration() {
        List<Pet> pets = Pets.arrayList(12);

        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet pet = it.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }

        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }

}
