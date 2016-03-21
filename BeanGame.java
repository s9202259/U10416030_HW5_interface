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
			Line buttonLine = new Line(60, 450, 360, 450);	//底線
			buttonLine.setStrokeWidth(5);
		
			Line lineLeft = new Line(60, 450, 60, 20);	//左線及右線
			lineLeft.setStrokeWidth(5);
			Line lineRight = new Line(360, 450, 360, 20);
			lineRight.setStrokeWidth(5);
			
			Line line1 = new Line(110, 450, 110, 320);	//分割線 1~6
			line1.setStrokeWidth(3);
			Line line2 = new Line(150, 450, 150, 320);
			line2.setStrokeWidth(3);
			Line line3 = new Line(190, 450, 190, 320);
			line3.setStrokeWidth(3);
			Line line4 = new Line(230, 450, 230, 320);
			line4.setStrokeWidth(3);
			Line line5 = new Line(270, 450, 270, 320);
			line5.setStrokeWidth(3);
			Line line6 = new Line(310, 450, 310, 320);
			line6.setStrokeWidth(3);
		
			this.getChildren().addAll(buttonLine, line1, line2, line3, line4, line5, 
									line6, lineLeft, lineRight);
		}
	}		
}
