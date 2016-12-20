package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import model.Branch;
import model.Settings;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Fractal tree");
		primaryStage.setOnCloseRequest(e -> Platform.exit());
		Canvas canvas = new Canvas(Settings.getWidth(), Settings.getHeight());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		this.drawTree(gc);
		Group root = new Group();
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
	}
	
	private void drawTree(GraphicsContext gc) {
		Branch root1= new Branch(Settings.getWidth()/2,0,Settings.getWidth()/2, Settings.getRootLength());
		Branch root2= new Branch(0,Settings.getHeight()/2,Settings.getRootLength(), Settings.getHeight()/2);
		Branch root3= new Branch(Settings.getWidth()/2,Settings.getHeight(),Settings.getWidth()/2, Settings.getHeight()-Settings.getRootLength());
		Branch root4= new Branch(Settings.getWidth(),Settings.getHeight()/2,Settings.getWidth()-Settings.getRootLength(), Settings.getHeight()/2);

		root1.genTree(gc);
		root2.genTree(gc);
		root3.genTree(gc);
		root4.genTree(gc);
	}

}
