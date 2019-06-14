package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

	
	public Tile(boolean white, int x, int y) {
		setWidth(QRcode.TILE_SIZE);
		setHeight(QRcode.TILE_SIZE);
		
		relocate(x * QRcode.TILE_SIZE, y * QRcode.TILE_SIZE);
		
		setFill(white ? Color.WHITE : Color.BLACK);
	
}
}