package io.cucumber.skeleton;
import java.util.*;

public class Catalogue {
    Vector<Movie> catalogue;

    public Catalogue() {
        catalogue = new Vector<>();
    }

    public void addMovie(Movie movie){
        catalogue.addElement(movie);
    }

    private int findMovie(String title){
        for(int i = 0; i < catalogue.size(); i++){
            if(this.catalogue.get(i).getTitle().equals(title)){
                System.out.println(this.catalogue.get(i).getTitle());
                return i;
            }
        }

        return -1;
    }

    public Movie watchMovie(String title) throws Exception{
        int index = findMovie(title);
        if(index >= 0)
            return catalogue.get(index);

        throw new Exception();
    }

    public void removeMovie(String title) throws Exception{
        int index = findMovie(title);
        if(index >= 0)
            catalogue.removeElementAt(index);

        throw new Exception();
    }

    public Integer getSize(){
        return catalogue.size();
    }
}
