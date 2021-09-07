package myfancyjavaproject;

public class NavBarSingleTon {
    
    private static NavBarSingleTon instance = null;
    private NavBar nBarProperty;
    NavBarSingleTon()
    {
    }
    
    NavBarSingleTon(String title, double padding,double fontSize,NavbarColors navbarColors)
    {
        nBarProperty = new NavBar(title, fontSize, padding, navbarColors);
    }


    public static NavBar GetNavBar(String title, double padding,double fontSize,NavbarColors navbarColors)
    {
        if(instance !=null )
        {
            return instance.nBarProperty;
        }

        instance = new NavBarSingleTon(title, fontSize, padding, navbarColors);
        
        return instance.nBarProperty;
    }


    public class getNavBarProperty {
    }


    
   
}
