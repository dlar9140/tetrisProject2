package gameboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener
{
	 private final int BOARD_WIDTH = 10;
	    private final int BOARD_HEIGHT = 22;
	    private final int DELAY = 400;

	    private Timer timer;
	    private boolean isFallingFinished = false;
	    private boolean isStarted = false;
	    private boolean isPaused = false;
	    private int numLinesRemoved = 0;
	    private int curX = 0;
	    private int curY = 0;
	    private JLabel statusbar;
	    private Shape curPiece;
	    private Tetrominoe[] board;

	    public Board(Tetris parent) {

	        initBoard(parent);
	    }
}
