public interface IObserved {
    public void addObserver(IObserver observer);

    public void removeObserver(IObserver observer);

    public void notifyObservers();
}
