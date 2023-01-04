public class Main {
    public static void main(String[] args) {
        MovieContainer horrorMovies = new MovieContainer();
        horrorMovies.addMovie(new Horror(1,"siccin","11 ekim",8.6));
        horrorMovies.addMovie(new Horror(2,"siccin","11 ekim",8.7));
        horrorMovies.addMovie(new Horror(3,"siccin","11 ekim",8.8));
        horrorMovies.addMovie(new Horror(4,"siccin","11 ekim",8.9));


        MovieContainer thriller=new MovieContainer();
        thriller.addMovie(new Thriller(5,"asda","15 ekim",5));
        thriller.addMovie(new Thriller(6,"asda","15 ekim",5));
        thriller.addMovie(new Thriller(7,"asda","15 ekim",5));



        thriller.showMovieInfo();
        horrorMovies.showMovieInfo();
    }
}