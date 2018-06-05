public class GenericOption <T> {
    private boolean isSet;
    private T value;

    public T get() throws NoValueException {
        if(isSet){
            return value;
        } else {
            throw new NoValueException();
        }
    }

    public void set(T value) {
        this.value = value;
        isSet = true;
    }

    public T getOrDefault(T orDefault) {
        if(isSet) {
            return value;
        } else {
            return orDefault;
        }
    }

    public GenericOption(T value) {
        this.value = value;
        isSet = true;
    }

    public static GenericOption empty() {
       return new GenericOption();
    }

    private GenericOption() {

    }

    public boolean isSet() {
        return isSet;
    }
}
