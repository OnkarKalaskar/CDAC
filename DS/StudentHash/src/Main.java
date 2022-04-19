
public class Main {

	public static void main (String [] args)
	{   
		Hashing hash = new Hashing(10);
			
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		System.out.println("ENTER DATA");
		s1.scanfun();
		s2.scanfun();
		s3.scanfun();
		s4.scanfun();
		s5.scanfun();
		
		hash.insertLin(s1);
		hash.insertLin(s2);
		hash.insertLin(s3);
		hash.insertLin(s4);
		hash.insertLin(s5);
		System.out.println(" inserted data.....");
		
		hash.removeLin(s3);
		hash.removeLin(s4);
		System.out.println(" after removal.....");
	}
}
//		System.out.println("Enter size of hashtable: ");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		Hashing studarr = new Hashing(size);
//
//		System.out.print("enter number of students data to store: ");
//        int num = sc.nextInt();
//		
//		for(int i=0;i<num;i++)
//		{
//			Student s1 = new Student ();
//			s1.scanfun();
//			studarr.strArray[i] = s1;
//		}
//		System.out.println("\n"+ "INSERTED VALUES"+ "\n");
//		System.out.println(studarr);
//		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//
//		int choice = 0;
//		do{
//			System.out.println("1: to remove data , 2: to exit");
//			choice = sc.nextInt();
//			if (choice == 2)
//			{
//				break;
//			}
//			switch (choice)
//			{
//			case 1:
//				{
//					System.out.println("Enter mobile number of student whose data to delete");
//					String mobNo = sc.next();
//					int i=0;
//					while(i<studarr.strArray.length)
//					{
//						if(studarr.strArray[i].mobile_no.equals(mobNo)) 
//						{
//							studarr.removeLin(studarr.strArray[i]);
//							System.out.println("1234");
//							break;
//						}
//						i++;
//					}
//						
////					if (studarr.strArray[i].mobile_no != mobNo)
////						{
////							System.out.println("enter valid mobile number.....");
////							break;
////						}
////					}
////					break;
//				}
//			default : 
//				{
//					System.out.println("enter valid choice....");
//					break;
//				}
//			}
//
//		}while (choice != 2);
//        System.out.println("End of process.......");
//		
//		System.out.println("\n"+ "AFTER REMOVAL OF VALUES"+ "\n");
//		System.out.println(studarr);	
//	}
//}
