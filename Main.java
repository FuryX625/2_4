import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner wczytanie=new Scanner(System.in);
    char z='z';
    
    System.out.println("Wpisuj znaki do kopiowania, jeżeli chcsz zakończyć podj q");
    while(true){
      z=wczytanie.next().charAt(0);
      if (z=='q') break;
      System.out.println(z);
    }
    
    
  }
}