public class GoodStudent
{
    //Instance Variables
    private String Fname;
    private String Lname;
    private String Nname;
    private String id;
    private double gpa;
    private boolean cs;

    //3 Constructors
    public GoodStudent(String firstName, String lastName, String nickName, String ID, double GPA, String CS)
    {
        Fname = firstName;
        Lname = lastName;
        Nname = "\"" + nickName + "\"";
        id = ID;
        gpa = GPA;
        cs = CS.equals("Yes");
    }//end full constructor

    public GoodStudent(String firstName, String lastName)
    {
        Fname = firstName;
        Lname = lastName;
        Nname = "";
        id = "";
        gpa = 0.0;
        cs = false;
    }//only first and last name constructor

    public GoodStudent()
    {
        Fname = "";
        Lname = "";
        Nname = "";
        id = "";
        gpa = 0;
        cs = false;
    }//default constructor


    //All Getters
    public String getFirstName()
    {
        return Fname;
    }

    public String getLastName()
    {
        return Lname;
    }

    public String getNickName()
    {
        return Nname;
    }

    public String getID()
    {
        return id;
    }

    public double getGPA()
    {
        return gpa;
    }

    public boolean getCS()
    {
        return cs;
    }

    //Appropriate Setters(all of them.)
    public void setNickName(String nickName)
    {
        Nname = nickName;
    }

    public void setGPA(double GPA)
    {
        gpa = GPA;
    }

    //Brain Methods
    //CreateID
    public String createID()
    {
        String stringID = id.toString();
        String newID = Fname.substring(0,1) + Lname + stringID.substring(stringID.length()-3);
        return Fname + "\'s ID: " + newID.toLowerCase();
    }//end createID method

    //CSGPA
    public String CSGPA()
    {
        double csGPA;
        String result;
        if (cs)
        {
            final double BOOST = 0.15;
            csGPA = gpa + (gpa*BOOST);
            result = Fname + "\'s CSGPA: " + csGPA;
        }
        else
            result = Fname + " is not a cs student, their gpa is " + gpa;

        return result;
    }//end CSGPA method

    //toString
    public String toString()
    {
        return "Name: " + Fname + " " + Lname +
                "\nNickname: " + Nname +
                "\nID: " + id +
                "\nGPA: " + gpa +
                "\nCS student: " + cs;
    }//end toString method

}//end class GoodStudent