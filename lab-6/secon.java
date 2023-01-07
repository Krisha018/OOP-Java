/*Declare a class called book having author_name as private data member. Extend book 
class to have two sub classes called book_publication & paper_publication. Each of 
these classes have private member called title. Write a complete program to show 
usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
publications of given author.Use command line arguments for inputting data*/
class book{
    private String author_name;
    public book(String a){
        author_name = a;
    }
    public void show(){
        System.out.println(author_name);
    }
}
class book_publication extends book{
    private String title;
    book_publication(){
        super();
    }
    public void show_title(){
        System.out.println(title);
    }
}
class paper_publication extends book{
    private String title;
    void show_title(){
        System.out.println(title);
    }
}
class secon{
    public static void main(String[] args) {
        book b = new book("Book1");
        book_publication b_p = new book_publication();
        paper_publication p_p = new paper_publication();
    }
}