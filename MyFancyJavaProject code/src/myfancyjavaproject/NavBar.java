package myfancyjavaproject;

enum NavbarColors
{
    Red,
    Yellow,
    Blue
}


public class NavBar {

    String title;
    double fontSize;
    double padding;
    NavbarColors navbarColors;
    
    NavBar( String title,
    double fontSize,
    double padding,
    NavbarColors navbarColors)
    {
        this.title = title;
        this.fontSize = fontSize;
        this.padding = padding;
        this.navbarColors = navbarColors;
    }


    void drawNavbAr()
    {
        System.out.println("Navbar is perfectly Palced.");
    }
}


