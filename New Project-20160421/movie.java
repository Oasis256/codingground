class Movie{
private String title;
private String director;
private int ageLimit;
private int year;
private int numberOfCopies;
// Creates a new Movie
public Movie(String title, String director, int ageLimit, int year, int numberOfCopies) {
  this.title=title;
  this.director=director;
  this.ageLimit=ageLimit;
  this.year=year;
  this.numberOfCopies = numberOfCopies;
}
//Returns title of a movie
public String getTitle(){
  return title;
}
//Returns the director of a movie
public String director(){
  return director;
}

//Returns the age limit of a movie
public int getAgeLimit(){
  return ageLimit;
}
//Returns the year of a movie
public int getYear(){
  return year;
}
// Returns true or false to indicate whether all copies of the movie are rented or not
public boolean isBorrowed() {
  return true;
}
//Adds new copy(ies) of a movie
public void addCopies(int copies){
}
//Removes a copy of a movie
public void removeCopy(){
}
//Return movie details
public String toString(){
  return title +" - "+ director +" " + year + " " + numberOfCopies + " in  Stock";
}
}