public class PosterManager {
    private PosterService[] items = new PosterService[0];

    private int numberPosters;

    public PosterManager(int numberPoster) {

        this.numberPosters = numberPoster;
    }

    public PosterManager() {
        this.numberPosters = 5;

    }


    public void add(PosterService item) {

        PosterService[] names = new PosterService[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            names[i] = items[i];
        }
        names[names.length - 1] = item;
        items = names;

    }

    public PosterService[] findAll() {
        return items;
    }

    public PosterService[] findLast() {
        int resultLenght;
        if (items.length > numberPosters) {
            resultLenght = numberPosters;
        } else {
            resultLenght = items.length;
        }

        PosterService[] reversed = new PosterService[resultLenght];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed

    }


}
