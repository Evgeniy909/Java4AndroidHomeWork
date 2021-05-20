package FirstLesson;

import javafx.scene.paint.Stop;

public class Main {

    public static void main(String[] args)
    {
        //______________________________________________первое задание

        int[] FirstArrInt = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < FirstArrInt.length; i++)
        {
            if (FirstArrInt[i] == 0) {
                FirstArrInt[i] = 1;
            }
            else if(FirstArrInt[i] == 1)
            {
                FirstArrInt[i] = 0;
            }
            System.out.println(FirstArrInt[i]);
        }

        //______________________________________________Второе задание
        int[] EmptyArr = new int[8];

        for (int i = 0; i < EmptyArr.length; i++)
        {
            FirstArrInt[i] = i * 3;
            System.out.println(FirstArrInt[i]);
        }

        //______________________________________________Третье задание
        int[] MultiplyArr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < MultiplyArr.length; i++)
        {
            if (MultiplyArr[i] < 6)
            {
                MultiplyArr[i] *=2;
                System.out.println(MultiplyArr[i]);
            }
        }

        //______________________________________________Четвертое задание
        int[][] SquareArr = new int[10][10];

        for (int i = 0; i < SquareArr.length; i++)
        {
            SquareArr[i][i] = 1;
        }

        //______________________________________________Пятое задание
        int[] MinMaxArr = new int[]{32, 5, 3, 94, 81, 87, 33, 2, 4, 8, 9, 54 };
        int Min = MinMaxArr[0];
        int Max = MinMaxArr[0];

        for (int i = 1; i < MinMaxArr.length; i++)
        {
            if(MinMaxArr[i]<Min)
            {
                Min= MinMaxArr[i];
            }
            if (MinMaxArr[i] > Max)
            {
                Max= MinMaxArr[i];
            }
        }
        System.out.println(Min + " " + Max);

        //______________________________________________Шестое задание
        int[] TestArr = new int[]{1,2,3,3,2,1};

        System.out.println(CheckBalance(TestArr));

        //______________________________________________Седьмое задание
        System.out.println("Test " + OffsetArr(TestArr,-1));
    }

    //______________________________________________Шестое задание
    public static boolean CheckBalance(int[] ArrBalance)
    {
        int LeftSum=0;
        int RightSum=0;

        for (int i = 0; i < ArrBalance.length; i++)
        {
            LeftSum += ArrBalance[i];

            for (int n = i+1; n < ArrBalance.length; n++) {
                RightSum += ArrBalance[n];
            }

            if (LeftSum == RightSum) {
                return true;
            }
            RightSum = 0;
        }
            return false;
    }

    //______________________________________________Седьмое задание
    public static int[] OffsetArr(int[] ArrOffset,int n)
    {
        int TempVar;

        if (n > 0) {
            for (int j = 0; j < n; j++) {
                TempVar=ArrOffset[0];

                for (int i = 1; i < ArrOffset.length; i++) {
                    ArrOffset[i-1] = ArrOffset[i];
                }
                ArrOffset[ArrOffset.length-1]=TempVar;
            }
        } else {
            for (int j = n; j < 0; j++) {
                TempVar=ArrOffset[ArrOffset.length-1];

                for (int i = ArrOffset.length-2; i>=0 ; i--) {
                    ArrOffset[i+1] = ArrOffset[i];
                }
                ArrOffset[0]=TempVar;
            }
        }
        return ArrOffset;
    }

}
