package src;

import java.util.Scanner;

public class BenTen {
    public static void main(String args[]){
        System.out.print("Enter the radius of the circle : ");
        Scanner scan = new Scanner(System.in);
        int rad = scan.nextInt();
        System.out.print("Enter pixel : ");
        char pix = scan.next().charAt(0);
        for(int i = rad; i >= 0; i--){
            double y = ((rad*rad)-(i*i));

            int x = (int)Math.sqrt(y);

            int lower_x = rad-x;
            int higher_x = rad+x;

            int x_line_lower = (int)(rad-(i/1.73));
            int x_line_higher = (int)(rad+(i/1.73));

            for(int j = 1; j <= lower_x; j++){
                System.out.print("  ");
            }
            System.out.print(pix+" ");
            if (x_line_lower > lower_x){
                for(int j = lower_x+1; j < x_line_lower; j++){
                    System.out.print("  ");
                }
                
                if (i != 0){
                    for(int j = x_line_lower; j <= x_line_higher+1; j++){
                        System.out.print(pix+" ");
                    } 
                }

                else{
                    System.out.print(pix+"   ");
                }

                for(int j = x_line_higher+1; j < higher_x-1; j++){
                    System.out.print("  ");
                }

            }

            else{
                for(int j = lower_x; j <= higher_x-2; j++){
                    System.out.print(pix+" ");
                }
            }

            if (lower_x  != higher_x)
            System.out.print(pix+" ");
            System.out.println("  ");
        }

        for(int i = 1; i <= rad; i++){
            double y = ((rad*rad)-(i*i));

            double sq = Math.sqrt(y);
            int x = (int)sq;

            int lower_x = rad-x;
            int higher_x = rad+x;

            int x_line_lower = (int)(rad-(i/1.73));
            int x_line_higher = (int)(rad+(i/1.73));

            for(int j = 1; j <= lower_x; j++){
                System.out.print("  ");
            }

            System.out.print(pix+" ");

            if (x_line_lower > lower_x){
                for(int j = lower_x+1; j < x_line_lower; j++){
                    System.out.print("  ");
                }

                for(int j = x_line_lower; j <= x_line_higher+1; j++){
                    System.out.print(pix+" ");
                }

                for(int j = x_line_higher+1; j < higher_x-1; j++){
                    System.out.print("  ");
                }

            }

            else{
                for(int j = lower_x; j <= higher_x-2; j++){
                    System.out.print(pix+" ");
                }
            }
            if (lower_x != higher_x){
                System.out.print(pix+" ");
            }
            System.out.println(" ");
        }


        scan.close();
    }
}
