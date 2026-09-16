class SelectionDemo
{
    public static void main(String[] args)
    {
        int n = 10;

        if(n > 0)
        {
            System.out.println("Positive Number");
        }

        if(n % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

        int marks = 75;

        if(marks >= 75)
            System.out.println("Distinction");
        else if(marks >= 60)
            System.out.println("First Class");
        else
            System.out.println("Pass");

        int choice = 2;

        switch(choice)
        {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}