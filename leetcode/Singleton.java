public class Singleton {
    static Singleton instance = new Singleton();
    
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

}
