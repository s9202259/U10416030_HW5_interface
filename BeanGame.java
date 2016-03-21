//U10416030 陳子勤

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class BeanGame extends Application{
	@Override
	public void start(Stage primaryStage){
		Scene scene = new Scene(new InterFace(), 420, 500);
		
		primaryStage.setTitle("U10416030 陳子勤");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	class InterFace extends Pane {
		InterFace() {
			Line buttonLine = new Line(60, 450, 360, 450);		
			buttonLine.setStrokeWidth(5);
		
			Line lineLeft = new Line(60, 450, 60, 20);
			lineLeft.setStrokeWidth(5);
			Line lineRight = new Line(360, 450, 360, 20);
			lineRight.setStrokeWidth(5);
			
			getChildren().addAll(buttonLine, lineLeft, lineRight);
		}
	}		
}
