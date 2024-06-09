public interface GenericInterface<T> {
    Object[] list = new Object[1000];
    boolean add(T vaule);
    boolean remove(T vaule);
}


class Zi implements GenericInterface<Integer> {
    int cnt = 0;
    @Override
    public boolean add(Integer vaule) {
        list[cnt++] = vaule;
        return true;
    }

    @Override
    public boolean remove(Integer vaule) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == vaule) {
                list[i] = 0;
            }
        }
        return true;
    }
}

