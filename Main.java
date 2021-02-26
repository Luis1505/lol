import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to tge DMV, Lets help your driver's license. Whats your name?");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Hello " + name + "! How old are you ");
    int age = scan.nextInt();

    if(age > 18)
    {
      qualifies();
    }else{
      System.out.println("Uh oh! Looks like you're too young. Please try again next year.");
    }
  }

public static void qualifies()
  {
    System.out.println("Have you taken & passed the Traffic Law Test. ");
    boolean trafficLawTest = scan.nextBoolean();
    System.out.println("Have you taken and passed the Road Rules and Road signs test?");
    boolean roadTest = scan.nextBoolean();
    System.out.println("Have you taken and passed the vision test");
    boolean visionTest = scan.nextBoolean();

    if(trafficLawTest && roadTest && visionTest)
    {
      System.out.println("Looks like you are ready for the next step");
      proofOfId();
    }else{
      System.out.println("Looks like you haven't completed all the tests. Lets take you back to that step");
      test();
    }
  }

  public static void proofOfId()
  {
    System.out.println("Do you have proof of completion of the traffic law course?");
    boolean proofOfCourse = scan.nextBoolean();
    System.out.println("Do you have your parental consent form?");
    boolean consent = scan.nextBoolean();
    System.out.println("do you have proof of Id?");
    boolean id = scan.nextBoolean();

    if(proofOfCourse && consent && id)
    {
      System.out.println(" Yay! there you go, your drivers license.");
    }else{
      System.out.println("lol trash");
    }
  }


}