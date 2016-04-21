import java.util.ArrayList;
class Customer{
private String name;
private int age;
private String phone;
private String address;
public ArrayList<Movie> borrowedMovies=new ArrayList<Movie>();
private int numberOfMoviesBorrowed;

//Creates a new Customer

 public Customer(String name, int age, String phone, String address){
  this.name=name;
  this.age=age;
  this.phone=phone;
  this.address=address;
}
 
//Returns the name of a customer
public String getName(){
  return name;
}

//Returns the age of a customer
public int getAge(){
  return age;
}
//Returns the phone number of a customer

public String getPhone(){
  return phone;
}
//Returns the address of a customer

public String getAddress(){
  return address;
}
//Returns a list of borrowed movies

public ArrayList<Movie> getBorrowedMovies(){
  return borrowedMovies;
}

//Returns number of movies borrowed
public int getNumberOfMoviesBorrowed(){
  return numberOfMoviesBorrowed;
}

//Adds borrowed movie
public void addBorrowedMovie(Movie movie){
}

//Remove returned from a collection of borrowed movies
public void removeReturnedMovie(Movie movie){
}

//Return customer details
public String toString(){
  return name + " -" + address + phone;
}
}
