public class Cgpa{
    public static void main(String[] args){
        float maths=67;
        float physics = 70;
        float biology =95;
        float english = 89;
        float chemistry=89;
        float CGPA;
      float total = (chemistry + english + biology + physics + maths);
      System.out.println("total is :"+total);
      CGPA=total/50;
        System.out.println("CGPA is :"+CGPA);
    }
}