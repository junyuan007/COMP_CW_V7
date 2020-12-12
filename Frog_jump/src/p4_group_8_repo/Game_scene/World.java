package p4_group_8_repo.Game_scene;


import java.util.ArrayList;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import p4_group_8_repo.Game_actor.Actor;

/**
 * Class for World
 * @author Jun Yuan
 *
 */
public abstract class World extends Pane {
    private AnimationTimer timer;
    
    /**
     * Construct an instance of World
     */
    public World() {
    	
    	sceneProperty().addListener(new ChangeListener<Scene>() {

			@Override
			public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
				if (newValue != null) {
					newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}
						
					});
				}		//end if
				
			}
    		
		});
    }

    /**
     * Method to create a timer
     */
    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                act(now);
                List<Actor> actors = getObjects(Actor.class);
                
                for (Actor anActor: actors) {
                	anActor.act(now);
                }
      
            }
        };
    }

    /**
     * Method to start timer
     */
    public void start() {
    	createTimer();
        timer.start();
    }
    
    /**
     * Method to resume timer
     */
    public void resume_timer() {
        timer.start();
    }

    /**
     * Method to stop timer
     */
    public void stop() {
        timer.stop();
    }
    
    /**
     * Method to add actor 
     * @param actor is the animations added
     */
    public void add(Actor actor) {
        getChildren().add(actor);
    }

    /**
     * Method to remove actor
     * @param actor is the animations removed
     */
    public void remove(Actor actor) {
        getChildren().remove(actor);
    }

    /**
     * Method to get the animations
     * @param <A> is the array list
     * @param cls is the class extending to look for
     * @return animation list 
     */
    public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        
        for (Node node: getChildren()) {    //Gets the list of children of this Parent
            if (cls.isInstance(node)) {		//cls is a type of node
                someArray.add((A) node);	//node is type cast into A and added to arrayli
            }
        }
        return someArray;
    }

    /**
     * Method act (empty class)
     * @param now is the current run time
     */
    public abstract void act(long now);
}
