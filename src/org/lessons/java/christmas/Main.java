package org.lessons.java.christmas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> gifts = new ArrayList<>();
		
		System.out.println("Let's write Christmas gifts list!\n");
		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int listLen = gifts.size();
			System.out.println("There are " + listLen + " gifts now");
			System.out.println("Do you want to add the " + (listLen + 1) + "° gift to the list?");
			System.out.println("Type 'y' or 'n'");
			
			String answer = in.nextLine();
			if (answer.equals("y")) {
				System.out.print("Write your desired gift: ");
				String gift = in.nextLine();
				gifts.add(gift);
			} else if (answer.equals("n")) {
				System.out.println("Here's your Christmas gift list:");
				for (int i = 0; i < gifts.size(); i++) {
					System.out.println((i + 1) + "- " + gifts.get(i));
				}
				return;
			} else {
				System.out.println("Please enter 'y' or 'n'");
			}
			in.close();
		}
	}
}
