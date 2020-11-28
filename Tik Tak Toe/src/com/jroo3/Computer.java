package com.jroo3;


import java.util.ArrayList;


public class Computer {
	
	 boolean iscorn = false;
   int fm = 0;
   public int takeTurn(char[][] b, ArrayList<Integer> taken) {
      char one = b[0][0];
      char two = b[0][1];
      char three = b[0][2];
      char four = b[1][0];
      char five = b[1][1];
      char six = b[1][2];
      char seven = b[2][0];
      char eight = b[2][1];
      char nine = b[2][2];
      boolean isFirst = firstMove(b);
      boolean isSecond = secondMove(b);
      if (isSecond) {
        boolean oneandnine = b[0][0] == 'X' && b[2][2] == 'X' && b[1][1] == 'O' && b[0][1] == ' ' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == ' ' && b[2][1] == ' ';

        boolean sevenandthree = b[0][0] == ' ' && b[2][2] == ' ' && b[1][1] == 'O' && b[0][1] == ' ' && b[0][2] == 'X' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == 'X' && b[2][1] == ' ';
        boolean icorn = oneandnine || sevenandthree;
        if (icorn) {
        iscorn = true;
        }


      boolean sixandseven = b[0][0] == ' ' && b[2][2] == ' ' && b[1][1] == 'O' && b[0][1] == ' ' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][2] == 'X' && b[2][0] == 'X' && b[2][1] == ' ';

       boolean fourandnine = b[0][0] == ' ' && b[2][2] == 'X' && b[1][1] == 'O' && b[0][1] == ' ' && b[0][2] == ' ' && b[1][0] == 'X' && b[1][2] == ' ' && b[2][0] == 'X' && b[2][1] == ' ';

       if (sixandseven || fourandnine) {
         return 8;
       }

        boolean threeandfour = b[0][0] == ' ' && b[2][2] == ' ' && b[1][1] == 'O' && b[0][1] == ' ' && b[0][2] == 'X' && b[1][0] == 'X' && b[1][2] == ' ' && b[2][0] == ' ' && b[2][1] == ' ';

        boolean sixandone = b[0][0] == 'X' && b[2][2] == ' ' && b[1][1] == 'O' && b[0][1] == ' ' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][2] == 'X' && b[2][0] == ' ' && b[2][1] == ' ';

      if (threeandfour || sixandone) {
        return 2;
      }

      boolean twoandseven = b[0][0] == ' ' && b[2][2] == ' ' && b[1][1] == 'O' && b[0][1] == 'X' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == 'X' && b[2][1] == ' ';

      boolean twoandnine = b[0][0] == ' ' && b[2][2] == 'X' && b[1][1] == 'O' && b[0][1] == 'X' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == ' ' && b[2][1] == ' ';

      
    if (twoandseven) {
      return 4;
    }

    if (twoandnine) {
      return 6;
    }

    boolean eightandone = b[0][0] == 'X' && b[2][2] == ' ' && b[1][1] == 'O' && b[0][1] == ' ' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == ' ' && b[2][1] == 'X';

      boolean eightandthree = b[0][0] == ' ' && b[2][2] == ' ' && b[1][1] == 'O' && b[0][1] == 'X' && b[0][2] == 'X' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == ' ' && b[2][1] == 'X';

if (eightandone) {
  return 4;
}
if (eightandthree) {
  return 6;
}

 boolean threeandfive = b[0][0] == ' ' && b[2][2] == ' ' && b[1][1] == 'X' && b[0][1] == ' ' && b[0][2] == 'X' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == 'O' && b[2][1] == ' ';
    
    if (threeandfive) {
      return 9;
    }

     boolean nineandfive = b[0][0] == 'O' && b[0][1] == ' ' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][1] == 'X' && b[1][2] == ' ' && b[2][0] == ' ' && b[2][1] == ' ' && b[2][2] == 'X';
    
    if (nineandfive) {
      return 3;
    }


     boolean sevenandfive = b[0][0] == ' ' && b[2][2] == ' ' && b[1][1] == 'X' && b[0][1] == ' ' && b[0][2] == 'O' && b[1][0] == ' ' && b[1][2] == ' ' && b[2][0] == 'X' && b[2][1] == ' ';
    
    if (sevenandfive) {
      return 1;
    }

     boolean oneandfive = b[0][0] == 'X' && b[0][1] == ' ' && b[0][2] == ' ' && b[1][0] == ' ' && b[1][1] == 'X' && b[1][2] == ' ' && b[2][0] == ' ' && b[2][1] == ' ' && b[2][2] == 'O';
    
    if (oneandfive) {
      return 7;
    }


      }
      if (isFirst) {
    	  ArrayList<Character> cs = new ArrayList<Character>();
          cs.add(one);
          cs.add(two); 
          cs.add(three); 
          cs.add(four); 
          cs.add(five); 
          cs.add(six); 
          cs.add(seven); 
          cs.add(eight); 
          cs.add(nine); 
          
          int index = cs.indexOf('X');
          if (index == 0 || index == 2 || index == 6 || index == 8) {
        	  int tr = 5;
        	  iscorn = true;
        	     fm = tr;  return tr;
          }
        	  else if (index == 1 || index == 3 || index == 5 || index == 7) {
        		    fm = 5;   return 5;
        	  
        	  } else if (index == 4) {
        		  
        		  int temp = rnum(1, 4);
            	  int tr = 0;
            	  switch (temp) {
            	  	case 1: tr = 1;	break;
            	  	case 2: tr = 3;	break;
            	  	case 3: tr = 7;	break;
            	  	case 4: tr = 9;	break;
            	  }
            	  
                
            	     return tr;
        		  
          } else {
        	  int rn;
              for(rn = rnum(1, 9); taken.contains(rn); rn = rnum(1, 9)) {
              }

                fm = rn;    return rn;
          }
          
          
    	  
      }
      
      if (iscorn) {
    	  iscorn = false;
    	  int temp = rnum(1, 4);
    	  int tr = 0;
    	  switch (temp) {
    	  	case 1: tr = 2;	break;
    	  	case 2: tr = 4;	break;
    	  	case 3: tr = 6;	break;
    	  	case 4: tr = 8;	break;
    	  }

        while (taken.contains(tr)) {
          temp = rnum(1, 4);
    	  tr = 0;
    	  switch (temp) {
    	  	case 1: tr = 2;	break;
    	  	case 2: tr = 4;	break;
    	  	case 3: tr = 6;	break;
    	  	case 4: tr = 8;	break;
    	  }
        }


    	       return tr;
      }
      
      
      
      
      
      if (one == 'O' && two == 'O' && three == ' ') {
              return 3;
      } else if (one == 'O' && two == ' ' && three == 'O') {
              return 2;
      } else if (one == ' ' && two == 'O' && three == 'O') {
              return 1;
      } else if (seven == 'O' && eight == 'O' && nine == ' ') {
              return 9;
      } else if (seven == 'O' && eight == ' ' && nine == 'O') {
              return 8;
      } else if (seven == ' ' && eight == 'O' && nine == 'O') {
              return 7;
      } else if (four == 'O' && five == 'O' && six == ' ') {
              return 6;
      } else if (four == 'O' && five == ' ' && six == 'O') {
              return 5;
      } else if (four == ' ' && five == 'O' && six == 'O') {
              return 4;
      } else if (one == 'O' && four == 'O' && seven == ' ') {
              return 7;
      } else if (one == 'O' && four == ' ' && seven == 'O') {
              return 4;
      } else if (one == ' ' && four == 'O' && seven == 'O') {
              return 1;
      } else if (two == 'O' && five == 'O' && eight == ' ') {
              return 8;
      } else if (two == 'O' && five == ' ' && eight == 'O') {
              return 5;
      } else if (two == ' ' && five == 'O' && eight == 'O') {
              return 2;
      } else if (three == 'O' && six == 'O' && nine == ' ') {
              return 9;
      } else if (three == 'O' && six == ' ' && nine == 'O') {
              return 6;
      } else if (three == ' ' && six == 'O' && nine == 'O') {
              return 3;
      } else if (one == 'O' && five == 'O' && nine == ' ') {
              return 9;
      } else if (one == 'O' && five == ' ' && nine == 'O') {
              return 5;
      } else if (one == ' ' && five == 'O' && nine == 'O') {
              return 1;
      } else if (seven == 'O' && five == 'O' && three == ' ') {
              return 3;
      } else if (seven == 'O' && five == ' ' && three == 'O') {
              return 5;
      } else if (seven == ' ' && five == 'O' && three == 'O') {
              return 7;
      } else if (one == 'X' && two == 'X' && three == ' ') {
              return 3;
      } else if (one == 'X' && two == ' ' && three == 'X') {
              return 2;
      } else if (one == ' ' && two == 'X' && three == 'X') {
              return 1;
      } else if (seven == 'X' && eight == 'X' && nine == ' ') {
              return 9;
      } else if (seven == 'X' && eight == ' ' && nine == 'X') {
              return 8;
      } else if (seven == ' ' && eight == 'X' && nine == 'X') {
              return 7;
      } else if (four == 'X' && five == 'X' && six == ' ') {
              return 6;
      } else if (four == 'X' && five == ' ' && six == 'X') {
              return 5;
      } else if (four == ' ' && five == 'X' && six == 'X') {
              return 4;
      } else if (one == 'X' && four == 'X' && seven == ' ') {
              return 7;
      } else if (one == 'X' && four == ' ' && seven == 'X') {
              return 4;
      } else if (one == ' ' && four == 'X' && seven == 'X') {
              return 1;
      } else if (two == 'X' && five == 'X' && eight == ' ') {
              return 8;
      } else if (two == 'X' && five == ' ' && eight == 'X') {
              return 5;
      } else if (two == ' ' && five == 'X' && eight == 'X') {
              return 2;
      } else if (three == 'X' && six == 'X' && nine == ' ') {
              return 9;
      } else if (three == 'X' && six == ' ' && nine == 'X') {
              return 6;
      } else if (three == ' ' && six == 'X' && nine == 'X') {
              return 3;
      } else if (one == 'X' && five == 'X' && nine == ' ') {
              return 9;
      } else if (one == 'X' && five == ' ' && nine == 'X') {
              return 5;
      } else if (one == ' ' && five == 'X' && nine == 'X') {
              return 1;
      } else if (seven == 'X' && five == 'X' && three == ' ') {
              return 3;
      } else if (seven == 'X' && five == ' ' && three == 'X') {
              return 5;
      } else if (seven == ' ' && five == 'X' && three == 'X') {
              return 7;
      } else {
         int rn;
         for(rn = rnum(1, 9); taken.contains(rn); rn = rnum(1, 9)) {
         }

              return rn;
      }
      
   }
   
   
   public static boolean firstMove(char[][] board) {
	   char[] ver = {board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2]};
	   int occ = getOccurences(' ', ver);
	   if (occ == 8) {
		   return true;
	   }
	return false;
	   
   }

   public static int rnum(int min, int max) {
      int tr = (int)(Math.random() * (double)(max - min + 1) + (double)min);
      return tr;
   }
   
   public static int getOccurences(char c, char[] a) {
	  int n = a.length;
	  char x = c;
	  int count = 0;
	  
	   for(int i = 0; i < n; i++)
       {
           if(a[i] == x)
           {
               count++;
           }
       }
	   return count;
   }


   public static boolean secondMove(char[][] board) {
	   char[] ver = {board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2]};
	   int occ = getOccurences(' ', ver);
	   if (occ == 6) {
		   return true;
	   }
	return false;
	   
   }
   
   

}