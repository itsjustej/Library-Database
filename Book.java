import src.Author;

public class Book {
        private String title, publisher, genre;
        private int year;
        private double rating, price;

        private Author author;

        public Book(){

        }
        public Book(Author author, String tile, int year, String genre, String publisher, int rating, double price){
            this.author = author;
            this.title = tile;
            this.year = year;
            this.publisher = publisher;
            this.genre = genre;
            this.rating = rating;
            this.price = price;
        }

        public Author getAuthor() {
            return author;
        }
        void setTile(String title){
            this.title = title;
        }

        public void setYear(int year){
            this.year = year;
        }

        void setPublisher(String publisher){
            this.publisher = publisher;
        }

        void setGenre(String genre){
            this.genre = genre;
        }

        void setRating(double rating){
            this.rating = rating;
        }

        void setPrice(double price){
            this.price = price;
        }

        String getTile(String tile){
            return tile;
        }

        int getYear(int year){
            return year;
        }

        String getPublisher(String publisher){
            return publisher;
        }

        String getGenre(String genre){
            return genre;
        }

        double getRating(double rating){
            return rating;
        }

        double getPrice(double price){
            return price;
        }

        public String toString() {
            return      "Author : " + author +
                        ", title: " + title +
                        ", year: " + year +
                        ", publisher: " + publisher  +
                        ", genre=: " + genre  +
                        ", rating: " + rating +
                        ", price: " + price;

        }

    }
