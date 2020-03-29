package cn.com.nightfield.patterns.creational.singleton.singletonDestroyAndProtect;

import java.io.*;

/**
 * to protect serialization to destroy singleton, we can add readResolve method to overcome.
 *
 * @author: zhochi
 * @create: 2020/3/28
 **/
public class SingletonSerializationProtecter {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InnerClassWrappedSingleton instance1 = InnerClassWrappedSingleton.getInstance();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance1);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        InnerClassWrappedSingleton instance2 = (InnerClassWrappedSingleton) ois.readObject();

        System.out.println("singleton instance1: " + instance1.hashCode());
        System.out.println("singleton instance2: " + instance2.hashCode());
    }

    public static class InnerClassWrappedSingleton implements Serializable {

        private InnerClassWrappedSingleton(){};
        private static class SingletonHolder {
            private static final InnerClassWrappedSingleton instance = new InnerClassWrappedSingleton();
        }
        public static InnerClassWrappedSingleton getInstance() {
            return SingletonHolder.instance;
        }
        // overcome serialization destroy
        private Object readResolve() {
            return SingletonHolder.instance;
        }

    }
}
