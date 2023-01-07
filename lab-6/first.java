/*Declare a class called student having following data members:id_no, 
no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
Define constructor and calculate_spi methods.Define main to instantiate an array for 
objects of class student to process data of n students to be given as command line 
arguments.*/


 class student{
    int id_no;
    int no_of_subjects_registered;
    String subject_code;
    int subject_credits;
    String grade_obtained;
    double spi;
    public student(int a, int b, String c, int d, String e){
        id_no = a;
        no_of_subjects_registered = b;
        subject_code =c;
        subject_credits = d;
        grade_obtained = e;
    }
    public void calculate_spi(Double f){
        this.spi = f;
        System.out.println(spi);
    }
    public void print(){
        System.out.println(id_no);
        System.out.println(no_of_subjects_registered);
        System.out.println(subject_code);
        System.out.println(subject_credits);
        System.out.println(grade_obtained);

    }
}

  class first{
    public static void main(String[] args) {
        student s1 = new student(101,5,"gh34234",4,"A");
        s1.calculate_spi(23.4);
        s1.print();
    }
}
