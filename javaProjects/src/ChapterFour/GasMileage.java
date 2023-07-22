package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    int totalMilesDriven;
    int totalGallonUsed;
    int milesDrivenCounter;
    int gallonCounter;
   Scanner input = new Scanner(System.in);
   public void milesDriven(){
       int milesDriven = 0;
       while(milesDriven != -1){
           System.out.println("Enter miles covered");
            milesDriven = input.nextInt();
            totalMilesDriven +=  milesDriven;
           milesDrivenCounter++;
       }
   }

   public void gallonUsed(){
       int gallonUsed = 0;
       while (gallonUsed !=-1){
           System.out.println("Enter gallon used");
           gallonUsed = input.nextInt();
           totalGallonUsed = totalGallonUsed + gallonUsed;
           gallonCounter +=  1;
       }
   }
   public void averageMilesDrivenPerGallon(){
       double averageMilesDrivenPerGallon =(double) (totalMilesDriven)/(totalGallonUsed);
       System.out.printf("The average miles driven per gallon is: %f%n",averageMilesDrivenPerGallon);
   }
}