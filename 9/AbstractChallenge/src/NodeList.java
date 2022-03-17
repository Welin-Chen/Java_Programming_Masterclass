public interface NodeList {
    public abstract ListItem getRoot();

    public abstract boolean addItem(ListItem root);

    public abstract boolean removeItem(ListItem root);

    public abstract void traverse(ListItem root);

}