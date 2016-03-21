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
			
			Circle circle1 = new Circle(210, 155, 4);	//一層
			
			Circle circle2_1 = new Circle(190, 185, 4);	//二層
			Circle circle2_2 = new Circle(230, 185, 4);
			
			Circle circle3_1 = new Circle(170, 215, 5);	//三層
			Circle circle3_2 = new Circle(210, 215, 5);
			Circle circle3_3 = new Circle(250, 215, 5);
			
			Circle circle4_1 = new Circle(150, 245, 6);	//四層
			Circle circle4_2 = new Circle(190, 245, 6);
			Circle circle4_3 = new Circle(230, 245, 6);
			Circle circle4_4 = new Circle(270, 245, 6);
			
			Circle circle5_1 = new Circle(130, 275, 7);	//五層
			Circle circle5_2 = new Circle(170, 275, 7);
			Circle circle5_3 = new Circle(210, 275, 7);
			Circle circle5_4 = new Circle(250, 275, 7);
			Circle circle5_5 = new Circle(290, 275, 7);
			
			Circle circle6_1 = new Circle(110, 305, 8);	//六層
			Circle circle6_2 = new Circle(150, 305, 8);
			Circle circle6_3 = new Circle(190, 305, 8);
			Circle circle6_4 = new Circle(230, 305, 8);
			Circle circle6_5 = new Circle(270, 305, 8);
			Circle circle6_6 = new Circle(310, 305, 8);
		
			this.getChildren().addAll(buttonLine, line1, line2, line3, line4, line5, 
						line6, lineLeft, lineRight);
			this.getChildren().addAll(circle6_1, circle6_2, circle6_3, circle6_4, circle6_5, circle6_6,
						circle5_1, circle5_2, circle5_3, circle5_4, circle5_5,
						circle4_1, circle4_2, circle4_3, circle4_4,
						circle3_1, circle3_2, circle3_3,
						circle2_1, circle2_2,
						circle1);
		}
	}		
}
