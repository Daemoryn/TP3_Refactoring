package extractInterface;

class ListeTableau implements Liste, ListGet {
    int nbLT;

    public static void staticLT() {
    }

    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    private void secretLT() {
    }
}
