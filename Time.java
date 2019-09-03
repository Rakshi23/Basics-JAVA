import java.util.Scanner;

class Time
{
	int hours,minutes,seconds,days=0;
	
	public Time(int h,int m,int s)
	{
		hours = h;
		minutes = m;
		seconds = s;
	}
	
	void add(Time obj2)
	{
		this.seconds += obj2.seconds;
		this.minutes += obj2.minutes;
		this.hours += obj2.hours;						//operator overloading

		
		
		if(this.seconds>=60)
		{
			this.minutes++;                 //this.minutes += this.seconds/60;
											//int g = this.seconds/60;
			this.seconds-=60;				//this.seconds -= 60*g;
		}
		if(this.minutes>=60)
		{
			this.hours++;
			this.minutes-=60;
		}
		if(this.hours>=24)
		{
			this.days=hours/24;
			this.hours-=24;
			
		}
	}
	
	void display()
	{
		System.out.println(this.days+" days:"+this.hours+":"+ this.minutes+":"+ this.seconds);
	}
	
	public static void main(String[] args)
	{
		Time obj1 = new Time(24,26,58);
		Time obj2 = new Time(24,26,58);
		
		obj1.add(obj2);
		System.out.println("The addition of Time is:");
		obj1.display();
	}
}