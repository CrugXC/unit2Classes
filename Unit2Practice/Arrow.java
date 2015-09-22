import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Graphics2D;


public class Arrow
{
    private int xCord;
    private int yCord;
    
    public Arrow(int x, int y);
    {
        xCord = x;
        yCord = y;
    }
    
    public void draw(Graphics2D g2)
    {
        
    