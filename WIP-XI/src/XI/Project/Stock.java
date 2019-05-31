/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

/**
 *
 * @author WipCamp11
 */
import java.util.Scanner;
public class Stock {
    public static void main(String[] args) {
        int item = 5;
        int limit = 10;
        int menu;
        System.out.println(" item : " + item);
        System.out.println(" limit : " + limit);
        System.out.println(" 1. Add item");
        System.out.println(" 2. Remove item");
        System.out.println(" 3. Check item");
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input menu : ");
        menu = sc.nextInt();
        if (menu == 1){
            if (item < limit){
                System.out.println("Add : ");
                int amount;
                amount = sc.nextInt();
                if (item + amount > limit){
                    System.out.println("ไอเท็มเกินลิมิต");
                }
                else{
                    item = item + amount;
                    System.out.println(" item : " + item);
                    System.out.println(" limit : " + limit);
                }
            }
        }
        else if (menu == 2){
            if (item > 0){
                System.out.println("remove :");
               int amount;
               amount = sc.nextInt();
               if (item - amount < 0){
                   System.out.println("ไอเท็มไม่พอให้ลบ");
               }
               else{
                    item = item - amount;
                    System.out.println(" item : " + item);
                    System.out.println(" limit : " + limit);
                } 
            }
            else{
                System.out.println("ไม่มีไอเท็มในโกดัง");
            }
        }
        else if (menu == 3){
            System.out.println(" item : " + item);
                    System.out.println(" limit : " + limit);
        }
        else{
            System.out.println("เมนูไม่ถูกต้อง");
        }
    }
}
