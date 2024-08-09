package com.sg.Method1;

class Numbers
{
    // Method to return an array of even numbers
    int[] Even()
    {
        int evenitems[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        return evenitems;
    }

    // Method to return an array of odd numbers
    int[] Odd()
    {
        int odditems[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        return odditems;
    }
    // third method
    int [] count()
    {
        int countitems[]={55,55,66,77,88};
        return countitems;

    }
}

public class method {
    public static void main(String[] args) {
        Numbers data = new Numbers();

        // Get and print even numbers
        int[] Numeven = data.Even();
        System.out.print("Even numbers: ");
        for (int kk : Numeven) {
            System.out.print(kk + " ");
        }
        System.out.println();

        // Get and print odd numbers
        int[] Numodd = data.Odd();
        System.out.print("Odd numbers: ");
        for (int kk : Numodd) {
            System.out.print(kk + " ");
        }
        System.out.println();

        //third method count
        int[]Numcount=data.count();
        for (int cc:Numcount){
            System.out.print(cc+" ");
        }
    }
}