package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBonus {
	public static void main(String[] args) {
		List<ChristmasGift> gifts = new ArrayList<>();
		
		System.out.println("Let's write Christmas gifts list!\n");
		
		try (Scanner in = new Scanner(System.in)) {
			while (true) {
				int listLen = gifts.size();
				System.out.println("There are " + listLen + " gifts now");
				System.out.println("Do you want to add the " + (listLen + 1) + "° gift to the list?");
				System.out.println("Type 'y' or 'n'");
				
				String answer = in.nextLine();
				if (answer.equals("y")) {
					System.out.println("Write your desired gift:");
					String gift = in.nextLine();
					
					System.out.println("Who do you want to give this present to?");
					String receiver = in.nextLine();
					
					ChristmasGift newGift = new ChristmasGift(gift, receiver);
					gifts.add(newGift);
				} else if (answer.equals("n")) {
					System.out.println("Here's your Christmas gift list:");
					for (int i = 0; i < gifts.size(); i++) {
						System.out.println((i + 1) + "- " + gifts.get(i).toString());
					}
					return;
				} else {
					System.out.println("Please enter 'y' or 'n'");
				}
			}
		}
	}
}
