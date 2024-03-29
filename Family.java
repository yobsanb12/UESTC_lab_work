public class Family
{
    private String[] members;
    //-----------------------------------------------------------------
    // Constructor: Sets up this family by storing the (possibly
    // multiple) names that are passed in as parameters.
    //-----------------------------------------------------------------

//    public Family (int test, String test2 ,String ... names)
//    {
//        members = names;
//    }
    public Family (String ... names)
    {
        members = names;
    }

    public Family (int a, String test, String ... names)
    {
        members = names;
    }

    //-----------------------------------------------------------------
    // Returns a string representation of this family.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "";
        for (String name : members)
            result += name + "\n";
        return result;
    }
}