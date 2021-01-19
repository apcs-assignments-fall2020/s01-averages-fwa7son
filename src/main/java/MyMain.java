public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        // mean is total divded by the number of elements in a list
        double arrTotal = 0;
        int arrLength = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int g = 0; g<mat[i].length; g++)
            {
                arrTotal = arrTotal + mat[i][g];
                arrLength = arrLength + 1;
            }
        }
        double ResultMean = arrTotal/arrLength;
        return ResultMean;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // median is the middle number
        int size = mat.length * mat[0].length;
        double[] oneArray = new double[size];

        int position = 0;

        double ResultMedian = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int g = 0; g<mat[i].length; g++)
            {
                oneArray[position] = mat[i][g];
                position++;
            }
        }
        if(size % 2 != 0)
        {
            ResultMedian = oneArray[size/2];
        }
        else
        {
            //average of 2 middle numbers
            //ResultMedian = (oneArray[size])
            ResultMedian = (((oneArray[size/2] + oneArray[size/2])-1)/2);
        }
        return ResultMedian;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // mode is the most frequennt number
        // 2d --> 1d then find mode of new 1d array
        double ResultMode = 0;
        int size = mat.length * mat[0].length;
        double[] oneArray = new double[size];
            
        int position1 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) { 
                oneArray[position1] = (mat[i][j]); 
                position1 ++;
            }
        }
        for(int i = 0; i < size; i++){
            int position2 = 0;
            for(int j = 0; j < size; j++)
            {
                if (oneArray[i]==oneArray[j])
                {
                    position2++;
                    if(position2 > ResultMode)
                    {
                        ResultMode = position2-1;
                        ResultMode = oneArray[i];
                    }
                }
            }
        }

        return ResultMode;
    }


    public static void main(String[] args) {
        double[][] m1 = {
            {2,  2,  4,  6},
            {7,  9,  10, 12},
            {14, 15, 17, 18},
            {22, 23, 27, 30}
        };
        System.out.println("Mean is " + mean(m1));
        System.out.println("Median is " + median(m1));
        System.out.println("Mode is " + mode(m1));
    }
}
