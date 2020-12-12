package p4_group_8_repo.Game_actor;

import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import p4_group_8_repo.Game_scene.World;

import java.util.ArrayList;

/**
 * Class of Actor
 * @author Jun Yuan
 *
 */
public abstract class Actor extends ImageView{

	/**
	 * Method for animations to move (coordinates are set)
	 * @param dx horizontal motion
	 * @param dy vertical motion
	 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    
    /**
     * Access to World
     * @return getParent() and type cast into WORLD
     */
    public World getWorld() {
        return (World) getParent();
    }

    /**
     * Access to width of animation
     * @return width of animation
     */
    public double getWidth() {
        return this.getBoundsInLocal().getWidth();
    }

    /**
     * Access to height of animation 
     * @return height if animation
     */
    public double getHeight() {
        return this.getBoundsInLocal().getHeight();
    }

    /**
     * Method to get objects which are intersect
     * @param <A> is the array list
     * @param cls is the class extending to look for
     * @return array list of animations which are intersected
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    /**
     * Method to manage input (empty body)
     * @param e is the key typed 
     */
    public void manageInput(InputEvent e) {
    	
    }

    /**
     * Method to get one intersecting object
     * @param <A> is the array list
     * @param cls is the class extending to look for
     * @return animation that is first intersecting
     */
    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }
    
    
    /**
     * Abstract method (empty body)
     * @param now is the current run time
     */
    public abstract void act(long now);

}
