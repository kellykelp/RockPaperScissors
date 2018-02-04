import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class RockPaperScissors extends PApplet {

String s = new String();
String instruction = new String();
ArrayList<String> myList = new ArrayList<String>();
String userChoice = new String();
String compChoice = new String();

public void setup() {

	
	background(0);
	s = "Hi! Here to play Rock, Paper, Scissors? Well, type \nin an answer and see if you can beat the computer!";
	instruction = "Press 1 for rock! \nPress 2 for paper! \nPress 3 for scissors!";
	myList.add("rock");
	myList.add("paper");
	myList.add("scissors");
	text(s, 10, 20);
	text(instruction, 10, 50);

}

public void draw() {

}

public void keyPressed() {

	if (key == '1')
	{
		background(0);
		userChoice = "rock";
		compChoice = myList.get((int)(Math.random()*myList.size()));
		System.out.println(compChoice);
		text("Your choice: " + userChoice + "\nComputer's choice: " + compChoice, 10, 20);

		if (userChoice.equals(compChoice))
		{
			text("Woahhh, tie??? Your mind is as strong as \nthis computer! Great minds think alike!", 10, 100);
		}
		else if (compChoice.equals("paper"))
		{
			text("You lost! This almighty computer is yet \nagain unbeatable!", 10, 100);
		}
		else 
		{
			text("You won! You beat the mighty brain of this computer!", 10, 100);
		}
	}

	if (key == '2')
	{
		background(0);
		userChoice = "paper";
		compChoice = myList.get((int)(Math.random()*myList.size()));
		System.out.println(compChoice);
		text("Your choice: " + userChoice + "\nComputer's choice: " + compChoice, 10, 20);

		if (userChoice.equals(compChoice))
		{
			text("Woahhh, tie??? Your mind is as strong as \nthis computer! Great minds think alike!", 10, 100);
		}
		else if (compChoice.equals("scissors"))
		{
			text("You lost! This almighty computer is yet \nagain unbeatable!", 10, 100);
		}
		else 
		{
			text("You won! You beat the mighty brain of this computer!", 10, 100);
		}
	}

	if (key == '3')
	{
		background(0);
		userChoice = "scissors";
		compChoice = myList.get((int)(Math.random()*myList.size()));
		System.out.println(compChoice);
		text("Your choice: " + userChoice + "\nComputer's choice: " + compChoice, 10, 20);

		if (userChoice.equals(compChoice))
		{
			text("Woahhh, tie??? Your mind is as strong as \nthis computer! Great minds think alike!", 10, 100);
		}
		else if (compChoice.equals("rock"))
		{
			text("You lost! This almighty computer is yet \nagain unbeatable!", 10, 100);
		}
		else 
		{
			text("You won! You beat the mighty brain of this computer!", 10, 100);
		}
	}

}
  public void settings() { 	size(300, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "RockPaperScissors" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
