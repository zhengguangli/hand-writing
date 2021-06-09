package wang.icopy.cammond;

public abstract class ProcessingObject<T> {
    
    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }

    public T handle(T input) {
        T r = handleWork(input);
        if (successor != null) {
            return successor.handle(input);
        }
        return r;
    }

    abstract protected T handleWork(T input);
}
