import ecs100.*;
/**
 * Class to handle the GUI functionality
 *
 * @author Harry Booth-Beach
 * @version (a version number or a date)
 */
public class GUI
{

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        Books bk = new Books();
        UI.initialise();
        UI.addButton("All", bk::printAll);
        
        UI.addButton("Quit", UI::quit);
    }

}
