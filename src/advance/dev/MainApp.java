package advance.dev;

import java.util.Scanner;

public class MainApp {	
	static void songuyen(int a, int b) {
		try {
		 b = 0;	
		 int c = a/b;
		} catch (Exception e) {
			System.out.println("Có Lỗi " + e);
		}
		System.out.println("Có lỗi!");
	}
	private static void a1(String a){
		int p ;
		if (a.trim().equals("")) {
            System.out.println("Ban nhap chuoi rong, xin vui long nhap lai: ");
        }
        try {
            p = Integer.parseInt(a);
    	    System.out.println("So la: "+ p);
        } catch (Exception ex) {
            System.out.println("Ban nhap chuoi khong phai dang so, xin vui long chi nhap so.");
        }

	}
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao a,b: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
		   songuyen(a, b);
		   System.out.println("Nhap vao a = ");
			String str = sc.next();
		    a1(str);
     }
} 


