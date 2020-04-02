package _05_netflix;

public class netflixrunner {
public static void main(String[] args) {
	Movie m = new Movie("The Shimphons",3);
	Movie o = new Movie ("that dog", 2);
	Movie v = new Movie ("??",4);
	Movie i = new Movie("The Drake", 5);
	Movie e = new Movie("The king" ,1);
	System.out.println(m.getTicketPrice());
	System.out.println(o.getTicketPrice());
	System.out.println(v.getTicketPrice());
	System.out.println(i.getTicketPrice());
	System.out.println(e.getTicketPrice());
	NetflixQueue N = new NetflixQueue();
	N.addMovie(m);
	N.addMovie(o);
	N.addMovie(v);
	N.addMovie(i);
	N.addMovie(e);
	N.printMovies();
	System.out.println("The best movie is . . . " + i);
	System.out.println("The second best movie is . . . " + v);
}
}
