import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your party affiliation (D, R, or I): ");
        //Output is choose the party Symbol
        String party =("S");

        if (party ==("D")) {// Input is if you select D
            System.out.println("You get a Democratic Donkey.");// output you get Democratic Donkey
        } else if (party ==("R")) {//Input is if you select R
            System.out.println("You get a Republican Elephant.");// output you get Republican Elephant
        } else if (party ==("I")) {//Input is if you select I
            System.out.println("You get an Independent Person.");// output you get Independent Person
        } else {// Input is if you select any other letter
            System.out.println("You get an Other.");//Output you get other
        }
    }
}
