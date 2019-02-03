class Minutes
{
	public static void main(String args[])
{  
    double minutesinayear=60 * 24 * 365;
    double minutes =5665;
    long years =(long)(minutes/minutesinayear);
    int months = (int)(minutes/60/2/365);
    int days = (int)(minutes/60/24)%365;
    System.out.println("minutes are" +minutes);
    System.out.println("years are" +years);
    System.out.println("months are" +months);
    System.out.println("days are" +days);


}

}