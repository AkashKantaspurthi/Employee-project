import java.util.*;
class Lot1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a,b and c");
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println("a is largest");
}
else
{
System.out.println("c is largest");
}
}
else
{
if(b>c)
{
System.out.println("b is largest");
}
else
{
System.out.println("c is largest");
}
}
}
}



class Lot2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a,b,c and d");
int a,b,c,d;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
if(a>b)
{
      if(a>c)
      {
            if(a>d)
            {
            System.out.println("a is largest");
 	    }
	    else
	    {
	    System.out.println("d is largest");
	    }
       }
       else
       {
	    if(c>d)
	    {
	    System.out.println("c is largest");
	    }
	    else
	    {
	    System.out.println("d is largest");
	    }
        }
}	
else
{
       if(b>c)
       {
	     if(b>d)
	     {
	     System.out.println("b is largest");
	     }
	     else
	     {
	     System.out.println("d is largest");
	     }
	}
       else
       {
             if(c>d)
             {
             System.out.println("c is largest");
             }
             else
             {
             System.out.println("d is largest");
             }
	}
}
}
}



class Lot5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e;
System.out.println("Enter the values of a,b,c,d and e");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
if(a>b)
{
      if(a>c)
      {
      	     if(a>d)
	     {
 	            if(a>e)
		    {
		      System.out.println("a is largest");
		    }
		    else
		    {
		      System.out.println("e is largest");
		    }
	     }
	     else
	     {
	        if(d>e)
	        {
	          System.out.println("d is largest");
	        }
	        else
	        {
	          System.out.println("e is largest");
	        }
      	     }
 	}  
    
	else{
	    if(c>d){
		    if(c>e){
		  	System.out.println("c is largest");
			   }
	            else{
			 System.out.println("e is largest");
	                }
		   }
	     else{
		    if(d>e){
			System.out.println("d is largest");
		            }
		    else{
			System.out.println("e is largest");
			 }
		   }
	      }
}
else{
      if(b>c){
            if(b>d){
                 if(b>e){
			  System.out.println("b is largest");
	                }
		 else{
		        System.out.println("e is largest");
		     }
		    }
   	    else{
		    if(d>e){
		      System.out.println("d is largest");
			   }
		    else{
		      System.out.println("e is largest");
			}
		}
             }
      else{
  	   if(c>d){
 		  if(c>e){
		            System.out.println("c is largest");
		         }
		      else{
			    System.out.println("e is largest");
	              	  }
		  }
		  else{
		        if(d>e){
		          System.out.println("d is largest");
		               }
		        else{
		          System.out.println("e is largest");
		            }
		       }
	           }
}
}
}




class Login
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String username="abc@com";
int password=12345;
String uname=username;
int pwd=password;
System.out.println("Enter the user name");
uname=sc.next();
System.out.println("Enter the user password");
pwd=sc.nextInt();
if(username.equals(uname))
{
if(password==pwd)
{
System.out.println("Valid credentials! Login is sucessful");
}
else
{
System.out.println("Invalid password! please try again");
}
}
else
{
System.out.println("Invalid usernane! please try again");
}
}
}



class Nearest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,rem;
System.out.println("Enter the value of n");
n=sc.nextInt();
if(n%5==0)
{
System.out.println(n+" "+"is divisible by 5");
}
else
{
rem=n%5;
if(rem>2)
System.out.println("nearest number="+(n-rem+5));
else
System.out.println("nearest number="+(n-rem));
}
}
}

