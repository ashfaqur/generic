public class SingletonLazy {

    private static class Holder {
        private static final SingletonLazy singleton = new SingletonLazy();
    }

    public SingletonLazy getInstance(){
        return Holder.singleton;
    }

    private SingletonLazy(){}
}
