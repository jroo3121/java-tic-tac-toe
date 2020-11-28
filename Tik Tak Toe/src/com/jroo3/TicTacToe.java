package com.jroo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TicTacToe {
  
public static ArrayList<Integer> playerPos = new ArrayList<Integer>();
public static ArrayList<Integer> cpuPos = new ArrayList<Integer>();

public static char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
{'-', '+', '-', '+', '-'},
{' ', '|', ' ', '|', ' '},
{'-', '+', '-', '+', '-'},
{' ', '|', ' ', '|', ' '}, };

public static void main(String[] args) {
newLine(2);
pgb();
Scanner in = new Scanner(System.in);
int q = 7;
while (q == 7) {
newLine(1);
p("Enter your placement. (1-9)");
int pos = in.nextInt();
while (playerPos.contains(pos) || cpuPos.contains(pos)) {
System.out.println("Position Taken!");
pos = in.nextInt();
}


gameBoard = placePiece(pos, gameBoard, 'X');


String res = checkWinner();
if (!res.equals("")) {
newLine(2);
pgb();
newLine(2);
System.out.println(res);
System.exit(1);
}



int rn = ctt();
while (playerPos.contains(rn) || cpuPos.contains(rn)) {
rn = ctt();
}

gameBoard = placePiece(rn, gameBoard, 'O');

newLine(2);
pgb();
newLine(2);


res = checkWinner();
if (!res.equals("")) {
newLine(2);
pgb();
newLine(2);
System.out.println(res);
System.exit(1);
}





newLine(2);

}

in.close();
}

public static String getGB(char[][] cc) {
String mm = "";
for (char[] row : cc) {
for (char c : row) {
mm = mm + c;
}
mm = mm + "\n";
}
return mm;


}

public static void newLine(int times) {
  for (int i = 0; i < times; i++) {
    System.out.println();
  }
}

public static void pgb() {
    System.out.println(getGB(gameBoard));

}

public static void p(String tp) {
  System.out.println(tp);
}

public static char[][] placePiece(int pos, char[][] voard, char user) {

if (user == 'X') {
  playerPos.add(pos);
}
if (user == 'O') {
  cpuPos.add(pos);
}


switch (pos) {
  case 1: voard[0][0] = user;  break;
  case 2: voard[0][2] = user;  break;
  case 3: voard[0][4] = user;  break;
  case 4: voard[2][0] = user;  break;
  case 5: voard[2][2] = user;  break;
  case 6: voard[2][4] = user;  break;
  case 7: voard[4][0] = user;  break;
  case 8: voard[4][2] = user;  break;
  case 9: voard[4][4] = user;  break;
  default:  break;
}
return voard;
}

public static int rnum(int min, int max) {
  int tr = (int)(Math.random() * (max - min + 1) + min);
return tr;
}


@SuppressWarnings("rawtypes")
public static String checkWinner() {

List topRow = Arrays.asList(1, 2, 3);
List midRow = Arrays.asList(4, 5, 6);
List botRow = Arrays.asList(7, 8, 9);
List leftCol = Arrays.asList(1, 4, 7);
List midCol = Arrays.asList(2, 5, 8);
List rightCol = Arrays.asList(3, 6, 9);
List cross1 = Arrays.asList(1, 5, 9);
List cross2 = Arrays.asList(7, 5, 3);

List<List> winning = new ArrayList<List>();

winning.add(topRow);
winning.add(midRow);
winning.add(botRow);
winning.add(leftCol);
winning.add(midCol);
winning.add(rightCol);
winning.add(cross1);
winning.add(cross2);

for (List l : winning) {

if (playerPos.containsAll(l)) {
return "Congratulations! You Won!!!";
} else if (cpuPos.containsAll(l)) {
return "Wow, you lost to a machine. So sad.";
} else if (playerPos.size() + cpuPos.size() == 9) {
return "Tie!";
}

}





return "";
}


public static int ctt() {
	
	Computer comp = new Computer();
	
	ArrayList<Integer> takenpos = new ArrayList<Integer>();
	takenpos.addAll(playerPos);
	takenpos.addAll(cpuPos);
	
	
  char[][] bd = new char[3][3];
  char[][] gb = gameBoard;
  
  bd[0][0] = gb[0][0];
  bd[0][1] = gb[0][2];
  bd[0][2] = gb[0][4];
  bd[1][0] = gb[2][0];
  bd[1][1] = gb[2][2];
  bd[1][2] = gb[2][4];
  bd[2][0] = gb[4][0];
  bd[2][1] = gb[4][2];
  bd[2][2] = gb[4][4];
  int trr = comp.takeTurn(bd, takenpos);


  
  return trr;
}

/* public static Integer[] lta(ArrayList<Integer> cpuPos2) {
	Integer[] arr = new Integer[cpuPos2.size()]; 
	arr = cpuPos2.toArray(arr); 
	return arr;
	
} */


}