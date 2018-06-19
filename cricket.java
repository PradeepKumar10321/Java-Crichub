/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricket;

/**
 *
 * @author Admin
 */

import java.util.*;
class crichub
{
    protected String player;
	int not_outs;
	int sum=0;
	static int[] matches_played = new int[5];
	static int[] runs_scored = new int[5];
	static int[] balls_faced = new int[5];
	double avg()
	{
       for(int i:runs_scored)
       {
       	sum=sum+i;
       }
       return sum/(5-not_outs);
	}int sum1=0;
	double strikerate()
	{
		for(int i:runs_scored)
       {
       	sum=sum+i;
       }
       for(int i:balls_faced)
       {
       	sum1=sum1+i;
       }
       return (sum/sum1)*100;
	}
        void display()
        {
        System.out.println("Player name is: "+player);
        System.out.println("number of not outs: "+not_outs);
        }
}
public class cricket extends crichub
{
    cricket(String n,int nn)
	{
		player=n;
		not_outs=nn;
	}
	public static void main(String[] args)
	{
	double batting_average;
	double strike_rate;
	cricket dhoni = new cricket("Mahendra Singh Dhoni",3);
	
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the runs scored by the player");
    for(int j=0;j<5;j++)
    {
       runs_scored[j] = sc.nextInt();
    } 
    System.out.println("enter the balls  faced by the player");
    for(int j=0;j<5;j++)
    {
       balls_faced[j] = sc.nextInt();
    } 
    double avg1 = dhoni.avg();
    double str1 = dhoni.strikerate();
    dhoni.display();
    System.out.println("average is: "+avg1);
    System.out.println("strike rate is: "+str1);
	}	
}
