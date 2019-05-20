package gameshapes;

import java.util.Random;

public class gameShapes
{
	 protected enum Tetrominoe 
	 { 
		 NoShape, ZShape, SShape, LineShape, 
         TShape, SquareShape, LShape, MirroredLShape 
     };

private Tetrominoe pieceShape;
private int coords[][];
private int[][][] coordsTable;

}

public Shape() 
{

    coords = new int[4][2];
    setShape(Tetrominoe.NoShape);
}

public void setShape(Tetrominoe shape) {

     coordsTable = new int[][][] {
        { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
        { { 0, -1 },  { 0, 0 },   { -1, 0 },  { -1, 1 } },
        { { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } },
        { { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } },
        { { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } },
        { { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } },
        { { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } },
        { { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } }
    };
    
    

