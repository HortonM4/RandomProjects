import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SecretSanta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of family members participating
        System.out.print("Enter the number of family members participating: ");
        int numFamilyMembers = input.nextInt();

        // Create an ArrayList to hold the names of the family members
        ArrayList<String> familyMembers = new ArrayList<String>();

        // Prompt the user to enter the name of each family member and add it to the ArrayList
        for (int i = 1; i <= numFamilyMembers; i++) {
            System.out.print("Enter the name of family member " + i + ": ");
            String name = input.next();
            familyMembers.add(name);
        }

        // Shuffle the ArrayList to randomly assign each family member a person to buy a gift for
        Collections.shuffle(familyMembers);

        // Create a HashMap to store the Secret Santa assignments
        HashMap<String, String> assignments = new HashMap<String, String>();

        // Loop through the shuffled ArrayList and assign each family member a person to buy a gift for
        for (int i = 0; i < familyMembers.size(); i++) {
            String giver = familyMembers.get(i);
            String receiver = familyMembers.get((i + 1) % familyMembers.size());
            assignments.put(giver, receiver);
        }

        // Print out the results for each family member
        System.out.println("Secret Santa assignments:");
        for (String familyMember : familyMembers) {
            String assignedTo = assignments.get(familyMember);
            System.out.println(familyMember + ", you are buying a gift for " + assignedTo);
        }
    }
}
