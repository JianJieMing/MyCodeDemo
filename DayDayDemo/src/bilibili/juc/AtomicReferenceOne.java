package bilibili.juc;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Classname AtomicReferenceOne
 * @Date 2019/7/30 15:17
 * @Created by jianjieming
 */
class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class AtomicReferenceOne {
    public static void main(String[] args) {
        User z3 = new User("z3", 22);
        User li4 = new User("li4", 25);

        AtomicReference<User> reference = new AtomicReference<>();
        reference.set(z3);
        System.out.println(reference.get());
        System.out.println(reference.compareAndSet(z3, li4) + "\t" + reference.get());
        System.out.println(reference.compareAndSet(z3, li4) + "\t" + reference.get());
        System.out.println(reference.get());
    }
}
