package Implementation;

import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int size = 200;
		ClientInfo[] cInfo = new ClientInfo[size];
		Specifications[] spct = new Specifications[size];
		
		int key=0;
		boolean inf = true;
		String x;
		double time = 2.30;
		int count = 0;
		
		System.out.println("<< WellCome To the Catering Survice >>");
		System.out.println();
		System.out.println("<< Please the necessary information >> ");
			for(int i=0;inf;i++)
			{
				cInfo[i] = new ClientInfo();
				spct[i] = new Specifications();
				System.out.print("Name :: ");
				cInfo[i].setName(input.next());
				System.out.print("Address :: ");
				cInfo[i].setAddress(input.next());
				System.out.print("Number :: ");
				cInfo[i].setPhoneNumber(input.next());
				System.out.print("Date :: ");
				cInfo[i].setDate(input.next());
				cInfo[i].setTime(time+=3);
				
				System.out.println("Type 11 -> Full Survice..");
				System.out.println("Type 22 -> Half Survice..");
				System.out.println("Enter code :: ");
				key = input.nextInt();
				
				if(key == 11)
				{
					System.out.print("Enter Food Type :: ");
					spct[i].setFoodType(input.next());
					System.out.print("Enter staff Number :: ");
					spct[i].setStaffNumber(input.nextInt());
					spct[i].setBookingType("Full");
					spct[i].setJobStatus("Active");
					System.out.println("how many people :: ");
					int people = input.nextInt();
					spct[i].setTotalCost((people*3500) + (spct[i].getStaffNumber()*1500));
					
					double dpjt = (spct[i].getTotalCost() * 30)/100.0; 
							
					System.out.println("Please deposit " + dpjt + " taka");
				}
				else if(key == 22)
				{
					System.out.print("Enter Food Type :: ");
					spct[i].setFoodType(input.next());
					spct[i].setBookingType("Half");
					spct[i].setJobStatus("Active");
					System.out.println("how many people :: ");
					int people = input.nextInt();
					spct[i].setTotalCost(people * 350);
					
					double dpjt = (spct[i].getTotalCost() * 20)/100.0; 
					spct[i].setPaidAmount(dpjt);
					spct[i].setOwingAmount(spct[i].getTotalCost() - dpjt);
					
					System.out.println("Please deposit " + dpjt + " taka");
				}
				else 
				{
					System.out.println("please enter valid code");
					break;
				}
				
				
				System.out.println("<< DO you want to have another appoinment >>");
				System.out.println("Type 'y' for yes or 'n' for No");
				x = input.next();
				if(x.equals("n"))
					break;
				else
				{
					count++;
					continue;
				}
			}
		
		while(inf)
		{
			key=0;
			System.out.println("Press 1 -> List of jobs actively being worked on");
			System.out.println("Press 2 -> Jobs that requires payment. ");
			System.out.println("Press 3 -> Jobs schedule on a Day.");
			System.out.println("Press 4 -> A payment towards a service job ");
			System.out.println("Press 5 -> Details of a Appointments");
			System.out.println("press 6 -> to Exit");
			
			System.out.println("Enter your choice :: ");
			key = input.nextInt();
			
			if(key == 1)
			{
				for(int i=0;i<count;i++)
				{
					if(spct[i].getJobStatus().equals("Active"))
					{
						System.out.println("Name :: "+ cInfo[i].getName() );
						System.out.println("Time :: "+ cInfo[i].getTime());
						System.out.println("Service type :: "+spct[i].getBookingType());
						System.out.println("Task is Completed");
						spct[i].setJobStatus("completed");
						System.out.println();
					}
				}
			}
			else if(key == 2)
			{
				for(int i=0;i<count;i++)
				{
					if((spct[i].getPaidAmount() != spct[i].getTotalCost()) && (spct[i].getJobStatus().equals("completed")))
					{
						System.out.println("Name :: "+ cInfo[i].getName() );
						System.out.println("Service type :: "+spct[i].getBookingType());
						System.out.println("Owing money :: " + spct[i].getOwingAmount());
						System.out.println();
					}
				}
			}
			else if(key == 3)
			{
				System.out.println("Enter the day :: ");
				String day = input.next();
				
				for(int i=0;i<count;i++)
				{
					if(day.equals(cInfo[i].getDate()))
					{
						System.out.println("Name :: "+ cInfo[i].getName() );
						System.out.println("Service type :: "+spct[i].getBookingType());
						System.out.println();
					}
				}
			}
			else if(key == 4)
			{
				for(int i=0;i<count;i++)
				{
					if(spct[i].getPaidAmount() != spct[i].getTotalCost())
					{
						System.out.println("Name :: "+ cInfo[i].getName() );
						System.out.println("Service type :: "+spct[i].getBookingType());
						System.out.println("you have to pay " + spct[i].getOwingAmount());
						System.out.println("please Enter the amount :: ");
						double amount = input.nextDouble();
						if(amount < spct[i].getOwingAmount())
						{
							spct[i].setOwingAmount(spct[i].getOwingAmount() - amount);
							System.out.println("New Owing amount " + spct[i].getOwingAmount());
							System.out.println();
						}
						else if(amount > spct[i].getOwingAmount())
						{
							System.out.println("??? You have entered more amount than needed ??? ");
							System.out.println();
						}
					}
				}
			}
			else if(key == 5)
			{
				System.out.println("<< Enter the client name to see detail >> ");
				String name = input.next();
				
				for(int i=0;i<count;i++)
				{
					if(name.equals(cInfo[i].getName()))
					{
						System.out.println("Name :: "+cInfo[i].getName());
						System.out.println("Address :: "+cInfo[i].getAddress());
						System.out.println("Number :: "+cInfo[i].getPhoneNumber());
						System.out.println("Date creatded :: "+cInfo[i].getDate());
						System.out.println("Booking type :: "+spct[i].getBookingType());
						System.out.println("Job status :: "+spct[i].getJobStatus());
						System.out.println("Total cost was ::"+spct[i].getTotalCost());
						System.out.println("Amount of paid :: "+ spct[i].getPaidAmount());
						System.out.println("Amount of owing :: "+spct[i].getOwingAmount());
						System.out.println();
					}
				}
			}
			else if(key == 6)
			{
				break;
			}
		}
		
		System.out.println("<<<<  THANK YOU  >>>>");
		
	}
	
}
