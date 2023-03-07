import java.util.Scanner;
class GPA{
    static float a;
	static String s;
	String su1;
    public void sub1(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IS1101(Aesthetic studies): ");
        su1 = my.next();
        GPA.s = su1;
    }
	String su2;
	public void sub2(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IS1203(English): ");
        su2 = my.next();
        GPA.s = su2;
    }
	String su3;
	public void sub3(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IS1204(Maths): ");
        su3 = my.next();
        GPA.s = su3;
    }
	String su4;
	public void sub4(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IT1201(Computer Networks): ");
        su4 = my.next();
        GPA.s = su4;
    }
	String su5;
	public void sub5(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IT1203(Digital Electronics): ");
        su5 = my.next();
        GPA.s = su5;
    }
	String su6;
	public void sub6(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IT1204(Software Engineering): ");
        su6 = my.next();
        GPA.s = su6;
    }
	String su7;
	public void sub7(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IT1205(IT Security): ");
        su7 = my.next();
        GPA.s = su7;
    }
	String su8;
	public void sub8(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IT1206(OOAD): ");
        su8 = my.next();
        GPA.s = su8;
    }
	String su9;
	public void sub9(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IT1207(OOP): ");
        su9 = my.next();
        GPA.s = su9;
    }
	String su10;
	public void sub10(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your grade for IT1208(Web Technologies): ");
        su10 = my.next();
        GPA.s = su10;
    }
	public void grade(){
        //GPA obj1 = new GPA();
        //String s = obj1.sub1();
		
        switch(GPA.s){
            case "A","A+","a","a+":
            GPA.a =  4.0f;
            break;

            case "A-","a-":
            GPA.a = 3.7f;
            break;

			case "B+","b+":
            GPA.a = 3.3f;
            break;

			case "B","b":
            GPA.a = 3.0f;
            break;

			case "B-","b-":
            GPA.a = 2.7f;
            break;

			case "C+","c+":
            GPA.a = 2.3f;
            break;

			case "C","c":
            GPA.a = 2.0f;
            break;

			case "F","f","AB","ab","I","i","NE","ne","N","n":
            GPA.a = 0.0f;
            break;

            default:
            System.out.println("invalid input!\npleace run the program with valid inputs");
			System.exit(0);
        }
    }

    public static void main(String[] args){
		
        GPA obj2 = new GPA();
        obj2.sub1();
        obj2.grade();
		float a1 = GPA.a*2.0f;
		double b1 = Math.round(a1*10)/10.0;
		obj2.sub2();
		obj2.grade();
        float a2 = GPA.a*2.0f;
		double b2 = Math.round(a2*10)/10.0;
		obj2.sub3();
        obj2.grade();
		float a3 = GPA.a*3.0f;
		double b3 = Math.round(a3*10)/10.0;
		obj2.sub4();
        obj2.grade();
		float a4 = GPA.a*3.0f;
		double b4 = Math.round(a4*10)/10.0;
		obj2.sub5();
        obj2.grade();
		float a5 = GPA.a*3.0f;
		double b5 = Math.round(a5*10)/10.0;
		obj2.sub6();
        obj2.grade();
		float a6 = GPA.a*2.0f;
		double b6 = Math.round(a6*10)/10.0;
		obj2.sub7();
        obj2.grade();
		float a7 = GPA.a*2.0f;
		double b7 = Math.round(a7*10)/10.0;
		obj2.sub8();
        obj2.grade();
		float a8 = GPA.a*2.0f;
		double b8 = Math.round(a8*10)/10.0;
		obj2.sub9();
        obj2.grade();
		float a9 = GPA.a*3.0f;
		double b9 = Math.round(a9*10)/10.0;
		obj2.sub10();
        obj2.grade();
		float a10 = GPA.a*3.0f;
		double b10 = Math.round(a10*10)/10.0;
		double gpa = (b1+b2+b3+b4+b5+b6+b7+b8+b9+b10)/25;
		
		System.out.println("your GPA is "+gpa);
    }

}