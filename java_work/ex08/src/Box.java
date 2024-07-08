public class Box {
    public String name;

    public void setName(String n) {
    name = n;
    }

    @Override
    public String toString() {
        return "Box{name "+name+"}";
    }
}
