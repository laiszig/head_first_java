class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;

        while (x < 4) {
            System.out.print("a");
            if(x < 1) {
            System.out.print(" ");
            }   
            System.out.print("n");
            if(x > 1) {
            System.out.print(" oyster");
            x = x + 2;
            }   
            if (x == 1) {
            System.out.print("noys");
            } 
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println();
            x = x + 1;
        }
    }
}



/*
a noise
annoys
an oyster
*/

// For each line, I need to go through the loop once.
/*
System.out.print(" ");          x > 0
System.out.print("a");          x < 1
System.out.print("n");          x > 1
System.out.print("an);          x > 3
.                               x < 4
x = x + 1                       System.out.print("noys");
x = x + 2                       System.out.print("oise");
x = x - 2                       System.out.print(" oyster");
x = x - 1                       System.out.print("annoys");
.                               System.out.print("noise");
*/
