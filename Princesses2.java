//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Princesses2 - My creation assignment. The overloaded Thread class. The Princesses2 class animates three princesses (Thread version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Princesses2 extends Thread
{
    private Console c;
    //Color variable for the princess dress colours
    private Color princess;
    //delay variable
    private int delay = 10;
    //position variable
    private int position;

    public void princesses ()
    {
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	//local colour variable for the skin tone
	Color peach = new Color (255, 233, 223);
	//local colour variable for the hair
	Color hair = new Color (205, 205, 105);

	//loop used for animate the princesses
	for (int i = position + 238 ; i > position ; i--)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (-59 + i, 366, 42, 130);
		c.setColor (hair);
		c.fillRect (-56 + i, 385, 34, 40);
		c.setColor (peach);
		c.fillOval (-53 + i, 375, 30, 30);
		c.fillRect (-46 + i, 400, 16, 10);
		c.setColor (princess);
		c.fillRoundRect (-54 + i, 410, 30, 80, 10, 10);
		c.fillArc (-59 + i, 425, 40, 140, 0, 180);
		c.setColor (hair);
		c.fillArc (-57 + i, 370, 36, 30, 0, 180);
		c.setColor (peach);
		c.fillRoundRect (-56 + i, 413, 7, 50, 10, 10);
		c.fillRoundRect (-28 + i, 413, 7, 50, 10, 10);
		c.setColor (Color.black);
		c.fillOval (-34 + i, 387, 5, 5);
		c.fillOval (-47 + i, 387, 5, 5);
		c.drawLine (-34 + i, 397, -44 + i, 397);
		int x[] = { - 48 + i, -40 + i, -32 + i};
		int y[] = {373, 366, 373};
		c.setColor (Color.yellow);
		c.fillPolygon (x, y, 3);
	    }
	    //used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }

    //basic princess
    public Princesses2 (Console con)
    {
	c = con;
	princess = new Color (255, 102, 178);
	position = 0;
    }


    // princess with a Color parameter
    public Princesses2 (Console con, Color n)
    {
	c = con;
	princess = n;
	position = -50;
    }


    // princess with a Color parameter, and a new delay time
    public Princesses2 (Console con, Color n, int t)
    {
	c = con;
	princess = n;
	delay = t;
	position = -100;

    }


    public void run ()
    {
	princesses ();
    }
}
