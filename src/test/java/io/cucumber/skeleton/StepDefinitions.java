package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    Catalogue catalogue;
    Movie requestedMovie;

    @Given("I have an empty catalogue")
    public void i_have_an_empty_catalogue() {
        catalogue = new Catalogue();
    }

    @When("a movie is added to the catalogue")
    public void a_movie_is_added_to_the_catalogue() {
        Movie movie = new Movie("Casino");
        catalogue.addMovie(movie);
    }

    @Then("the size of the catalogue is now {int}")
    public void the_size_of_the_catalogue_is_now(Integer size) {
        assertEquals(size, catalogue.getSize());
    }

    @Given("I have a catalogue with a movie")
    public void i_have_a_catalogue_with_a_movie() {
        catalogue = new Catalogue();
        Movie movie = new Movie("The Godfather");
        catalogue.addMovie(movie);
    }

    @When("the movie is removed from the catalogue")
    public void the_movie_is_removed_from_the_catalogue() {
        try{
            catalogue.removeMovie("The Godfather");
        } catch (Exception e) {}
    }

    @Given("I have {string} as a listed movie")
    public void i_have_as_a_listed_movie(String title) {
        catalogue = new Catalogue();
        Movie movie = new Movie(title);
        catalogue.addMovie(movie);
    }

    @When("user requests to watch {string}")
    public void user_requests_to_watch(String title) {
        try {
            requestedMovie = catalogue.watchMovie(title);
        } catch (Exception e) {}
    }

    @Then("user gets the movie {string}")
    public void user_gets_the_movie(String title) {
        assertEquals(title, requestedMovie.getTitle());
    }
}
