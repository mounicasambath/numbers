
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jagan
 */
public class tower1 {
    //import java.util.Scanner;
//public class TowerOfHanai {

	 public void solve(int number, String str, String mid, String end) 
	 {
	       if (number == 1) 
	       {
	           System.out.println(str + " -> " + end);
	       } else 
	       {
	           solve(number - 1, str, end, mid);
	           System.out.println(str + " -> " + end);
	           solve(number - 1, mid, str, end);
	       }
	   }
	 public static void main(String[] args) {
	       TowerOfHanai towersOfHanoi = new TowerOfHanai();
	       System.out.print("Enter number of discs: ");
	       Scanner sc = new Scanner(System.in);
	       int discs = sc.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }

    private static class TowerOfHanai {

        public TowerOfHanai() {
        }

        private void solve(int discs, String a, String b, String c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
	}


