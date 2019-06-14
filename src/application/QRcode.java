package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class QRcode extends Application {
	public static final int TILE_SIZE = 16;
	public static final int WIDTH = 32;
	public static final int HEIGHT = 32;
	
	private Group tileGroup = new Group();
	private Group largeSquares = new Group();
	
	private Parent createContent() {
		Pane root = new Pane();
		root.setPrefSize(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
		root.getChildren().addAll(tileGroup);
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				Tile tile = new Tile(Math.random() > 0.5, x, y);
				
				tileGroup.getChildren().add(tile);
			}
		}
		Rectangle tr = new Rectangle(380, 0, 135, 165);
		Rectangle tr2 = new Rectangle(390, 0, 125, 155);
		Rectangle tr3 = new Rectangle(405, 20, 93, 110);
		Rectangle tr4 = new Rectangle(421, 40, 60, 70);
		
		Rectangle tl = new Rectangle(0, 0, 135, 165);
		Rectangle tl2 = new Rectangle(0, 0, 125, 155);
		Rectangle tl3 = new Rectangle(15, 20, 93, 110);
		Rectangle tl4 = new Rectangle(32, 40, 60, 70);
		
		Rectangle bl = new Rectangle(0, 358, 135, 170);
		Rectangle bl2 = new Rectangle(0, 368, 125, 155);
		Rectangle bl3 = new Rectangle(15, 385, 93, 105);
		Rectangle bl4 = new Rectangle(32, 400, 60, 70);
		
		Rectangle mid = new Rectangle(360, 340, 65, 95);
		Rectangle mid2 = new Rectangle(372, 358, 40, 60);
		Rectangle mid3 = new Rectangle(385, 375, 15, 25);
		
		tr.setFill(Color.WHITE);
		tr2.setFill(Color.BLACK);
		tr3.setFill(Color.WHITE);
		tr4.setFill(Color.BLACK);
		
		root.getChildren().add(tr);
		root.getChildren().add(tr2);
		root.getChildren().add(tr3);
		root.getChildren().add(tr4);
		
		tl.setFill(Color.WHITE);
		tl2.setFill(Color.BLACK);
		tl3.setFill(Color.WHITE);
		tl4.setFill(Color.BLACK);
		
		root.getChildren().add(tl);
		root.getChildren().add(tl2);
		root.getChildren().add(tl3);
		root.getChildren().add(tl4);
		
		bl.setFill(Color.WHITE);
		bl2.setFill(Color.BLACK);
		bl3.setFill(Color.WHITE);
		bl4.setFill(Color.BLACK);
		
		root.getChildren().add(bl);
		root.getChildren().add(bl2);
		root.getChildren().add(bl3);
		root.getChildren().add(bl4);
		
		root.getChildren().add(mid);
		mid.setFill(Color.BLACK);
		root.getChildren().add(mid2);
		mid2.setFill(Color.WHITE);
		root.getChildren().add(mid3);
		mid3.setFill(Color.BLACK);
		
		

	return root;
}
	
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(createContent());
		primaryStage.setTitle("QR Code");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
