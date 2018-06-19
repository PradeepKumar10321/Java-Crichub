import java.awt.event.*;
import javax.swing.*;
public class awtSwing implements ActionListener{
    public String name,single,doubles,fours,sixes,dots,type;
	public int balls_faced,runs_scored,sum,points,sr,si,ds,dt,fr,six;
	JFrame f = new JFrame("Crichubbers");
		JTextField tf = new JTextField(" Welcome to Crichubbers");
		JButton b = new JButton("click me ('_')");
		JLabel l1 = new JLabel("Player Name :");
		JTextField t1 = new JTextField();
		JLabel l2= new JLabel("singles :");
		JTextField t2 = new JTextField();
		JLabel l3= new JLabel("doubles :");
		JTextField t3 = new JTextField();
		JLabel l4= new JLabel("fours :");
		JTextField t4 = new JTextField();
		JLabel l5= new JLabel("sixes :");
		JTextField t5 = new JTextField();
		JLabel l6= new JLabel("dots :");
		JTextField t6 = new JTextField();
		JLabel l7= new JLabel("player type :");
		JTextField t7 = new JTextField();
		JLabel l8= new JLabel("points :");
		JTextField t8 = new JTextField();
	 awtSwing()
	 {
		tf.setBounds(100,100,500,30);
		b.setBounds(100,150,150,30);
		l1.setBounds(100,300,100,30);
		t1.setBounds(300,300,100,30);
		l2.setBounds(100,350,100,30);
		t2.setBounds(300,350,100,30);
		l3.setBounds(100,400,100,30);
		t3.setBounds(300,400,100,30);
		l4.setBounds(100,450,100,30);
		t4.setBounds(300,450,100,30);
		l5.setBounds(100,500,100,30);
		t5.setBounds(300,500,100,30);
		l6.setBounds(100,550,100,30);
		t6.setBounds(300,550,100,30);
		l7.setBounds(100,600,100,30);
		t7.setBounds(300,600,100,30);
		l8.setBounds(100,650,100,30);
		t8.setBounds(300,650,100,30);
		b.addActionListener(this);
		f.add(b);
		f.add(tf);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(l6);
		f.add(t6);
		f.add(l7);
		f.add(t7);
		f.add(l8);
		f.add(t8);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 public void actionPerformed(ActionEvent e)
	{ 
		if(e.getSource()==b)
			tf.setText("Enter the foll details to calculate the fantasy points");
	   name=t1.getText();
       single=t2.getText();
       si=Integer.parseInt(single);
       doubles=t3.getText();
       ds=Integer.parseInt(doubles);
       fours=t4.getText();
       fr=Integer.parseInt(fours);
       sixes=t5.getText();
       six=Integer.parseInt(sixes);
       dots=t6.getText();
       dt=Integer.parseInt(dots);
       type=t7.getText();
            sum+= si;
            sum+=(ds*2)+ds;
            sum+=(fr*4)+(fr*2);
            sum+=(six*6)+(six*5);
            sum-=dt;
            balls_faced=si+ds+fr+six+dt;
            runs_scored=si+(ds*2)+(fr*4)+(six*6);
            sr = (int)(runs_scored/balls_faced)*100;
            if(sr>250)
            {
            	sum=sum+100;
            }
            else if(sr>=200 && sr<250)
            {
            	sum=sum+50;
            }
            else if(sr>=150 && sr<200)
            {
                sum=sum+25;
            }
            else if(sr>=50 && sr<100)
            {
            	sum=sum-25;
            }
            else if(sr<50)
            {
            	sum=sum-50;
            }
            if(type.equals("powerplayer"))
            {
            	sum=sum*2;
            }
        String pt = String.valueOf(sum);
        t8.setText(pt);
    }
	public static void main(String args[])
	{
       new awtSwing();
    }		
}