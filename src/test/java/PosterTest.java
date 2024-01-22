import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PosterTest {


    PosterService poster1 = new PosterService("Galaxy");
    PosterService poster2 = new PosterService("Universe");
    PosterService poster3 = new PosterService("Astronaut");
    PosterService poster4 = new PosterService("Galaxy");
    PosterService poster5 = new PosterService("Universe");
    PosterService poster6 = new PosterService("Astronaut");


    @Test
    public void addNewMovies() {
        PosterManager repo = new PosterManager();
        repo.add(poster1);
        repo.add(poster2);
        repo.add(poster3);


        PosterService[] expected = {poster1, poster2, poster3};
        PosterService[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void reverseAllItems() {
        PosterManager repo = new PosterManager(3);
        repo.add(poster1);
        repo.add(poster2);
        repo.add(poster3);
        repo.add(poster4);

        PosterService[] expected = {poster4, poster3, poster2};
        PosterService[] actual = repo.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ifPostersMoreThanAre() {
        PosterManager repo = new PosterManager(6);
        repo.add(poster1);
        repo.add(poster2);
        repo.add(poster3);
        repo.add(poster4);

        PosterService[] expected = {poster4, poster3, poster2, poster1};
        PosterService[] actual = repo.findLast();


        Assertions.assertArrayEquals(expected, actual)
    }
}
