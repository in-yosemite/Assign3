Copyright [2017] [Hansung Universtiy]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

package test;

import java.util.Scanner;

public class Calender {

//This is Calender program.
//Input data is only Integer type.
	public static void main(String[] args) {
		   System.out.println("input year ");
	        Scanner scanner1 = new Scanner(System.in);
	        int year = scanner1.nextInt();

	        System.out.println("input month");
	        Scanner scanner2 = new Scanner(System.in);
	        int month = scanner2.nextInt();

	        System.out.println("input day");
	        Scanner scanner3 = new Scanner(System.in);
	        int day = scanner1.nextInt();

	        int[] max_value_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        int sum_month_temp = 0;
	        int total_days = 0;

	        total_days += (year - 1) + 365;
	        total_days += year / 4 - year / 100 + year / 400;

	        int four_multiple = year % 4;
	        int hundred_multiple = year % 100;


	        if (four_multiple == 0 && hundred_multiple == 0) {
	            if (month == 1 || month == 2) {
	                total_days--;
	                max_value_month[1] = 29;
	            }
	        } else if (four_multiple == 0 && hundred_multiple != 0) {
	            if (month == 1 || month == 2) {
	                total_days--;
	                max_value_month[1] = 29;
	            }
	        } else {
	        }


	        if (month ==1 ){
	            sum_month_temp = 0;
	        }
	        else{
	            for(int i=0; i< month -1; i++){
	                sum_month_temp += max_value_month[i];

	                total_days += sum_month_temp = day;
	            }
	        }


	        System.out.println("  "+"sun   "+"mon   "+"Tue   "+"Wnd   "+"Thr   "+"Fri   "+"Sat    " );

	        int check_day_of_the_week = (total_days+2) % 7;

	        for(int i=0;i<check_day_of_the_week; i++){
	            System.out.printf("     ");
	        }

	        for(int j = 1;j<=max_value_month[month-1];j++){
	            if(day == j){
	                System.out.printf("%4d"+"*",j);
	            }
	            else{
	                System.out.printf("%4d"+" ",j);
	            }
	            if((j+check_day_of_the_week)%7 == 0 ) System.out.println();
	        }




	}

}
