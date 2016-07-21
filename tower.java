
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
public class tower {
    //import java.util.Scanner;


	 public void solve(int numb, String str, String mid, String end, int num) 
	 {
	       if (numb == 1) 
	       {
	           System.out.println(str + " -> " + end);
	       } else 
	       {
	           solve(numb - 1, str, end, mid);
	           System.out.println(str + " -> " + end);
	           solve(numb - 1, mid, str, end);
	       }
	   }
	 public static void main(String[] args) {
	       TowerOfHanai towersOfHanoi = new TowerOfHanai();
	       System.out.print("Enter number of discs: ");
	       Scanner sc = new Scanner(System.in);
	       int discs = sc.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }

    private void solve(int i, String str, String end, String mid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	}

    

