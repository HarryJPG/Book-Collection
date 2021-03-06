import ecs100.*;
/**
 * Support class of Book
 * A book contains an id, name, author, quantity, image
 *
 * @author Harry Booth-Beach
 * @version May 2021
 */
public class Book
{
    // fields
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;
    static final String DEFAULT_IMAGE = "book.png";
    
    private double locX, locY;
    
    /**
     * Constructor for objects of class Book
     */
    public Book(int id, String nm, String auth, int qty, String img)
    {
        // initialise instance variables
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        this.image = img;
    }
    
    /**
     * Constructor overloading
     * Set default image to obj
     */
    public Book(int id, String nm, String author, int qty)
    {
        this(id, nm, author, qty, DEFAULT_IMAGE);
    }
    
    /**
     * Getter for id
     * 
     * @return int the id
     */
    public int getId()
    {
        return this.id;
    }
    
    /**
     * Getter for name
     * 
     * @return String the name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Getter for author
     * 
     * @return String the author
     */
    public String getAuthor()
    {
        return this.author;
    }
    
    /**
     * Getter for quantity
     * 
     * @return String the author
     */
    public int getQuantity()
    {
        return this.quantity;
    }
    
    /**
     * Display our image on our GUI
     */
    public void displayBook()
    {
        double locX = 100;
        double locY = 100;
        final double WIDTH = 100;
        final double HEIGHT = 100;
        
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
}
