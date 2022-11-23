package lesson1;

class ImmutablePerson {

    private final String name;
    private final String[] hobby;

    public ImmutablePerson(String name, String[] hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String[] getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                '}';
    }
}
