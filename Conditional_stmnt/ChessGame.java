// import javaawt.*;
// import.awt.eventMouseEvent;
// import.awt.eventMouseListener;
// import javaawt.image.BufferedImage
// import java..File;
// import.io.IOException;
// import javax.imageio.ImageIO;

// public class ChessGame extends JFrame {

//     // Set up some constants
//     final int WIDTH = 800;
//     final int HEIGHT = 800;
//     final int DIMENSION = 8;
//     final int SQ_SIZE = HEIGHT / DIMENSION;
//     final int MAX_FPS = 15; // for animation

//     BufferedImage[] images;

//     // Initialize the board
//     char[][] board;

//     // Initialize the selected piece
//     int selectedRow, selectedCol;

//     // Initialize the game state
//     boolean whiteTurn, gameOver;

//     public ChessGame() {
//         super("Chess Game");
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setSize(WIDTH, HEIGHT);
//         setLocationRelativeTo(null);
//         setResizable(false);

//         // Initialize the board
//         board = new char[DIMENSION][DIMENSION];
//         for (int i = 0; i < DIMENSION; i++) {
//             for (int j = 0; j < DIMENSION; j++) {
//                 board[i][j] = '  ';
//             }
//         }

//         // Initialize the selected piece
//         selectedRow = -1;
//         selectedCol = -1;

//         // Initialize the game state
//         whiteTurn = true;
//         gameOver = false;

//         // Load the images
//         images = new BufferedImage[12];
//         try {
//             for (int i = 0; i < 12; i++) {
//                 images[i] = ImageIO.read(new File("images/" + i + ".png"));
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // Add a mouse listener
//         addMouseListener(new MouseListener() {
//             @Override
//             public void mousePressed(MouseEvent e) {
//                 int row = e.getY() / SQ_SIZE;
//                 int col = e.getX() / SQ_SIZE;

//                 if (selectedRow == -1) { // select a piece
//                     if (board[row][col] != '  ' && board[row][col][0] == (whiteTurn ? 'w' : 'b')) {
//                         selectedRow = row;
//                         selectedCol = col;
//                     }
//                 } else { // move the piece
//                     if (board[row][col] == '  ' || board[row][col][0] != board[selectedRow][selectedCol][0]) {
//                         board[row][col] = board[selectedRow][selectedCol];
//                         board[selectedRow][selectedCol] = '  ';
//                         selectedRow = -1;
//                         selectedCol = -1;
//                     }
//                 }
//                 repaint();
//             }

//             @Override
//             public void mouseReleased(MouseEvent e) {
//             }

//             @Override
//             public void mouseEntered(MouseEvent e) {
//             }

//             @Override
//             public void mouseExited(MouseEvent e) {
//             }

//             @Override
//             public void mouseClicked(MouseEvent e) {
//             }
//         });

//         // Start the game
//         new Timer(1000 / MAX_FPS, (e) -> {
//             repaint();
//         }).start();
//     }

//     // Draw the board and pieces
//     @Override
//     public void paint(Graphics g) {
//         super.paint(g);

//         // Draw the squares
//         for (int i = 0; i < DIMENSION; i++) {
//             for (int j = 0; j < DIMENSION; j++) {
//                 if ((i + j) % 2 == 0) {
//                     g.setColor(Color.WHITE);
//                 } else {
//                     g.setColor(Color.GRAY);
//                 }
//                 g.fillRect(i * SQ_SIZE, j * SQ_SIZE, SQ_SIZE, SQ_SIZE);
//             }
//         }

//         // Draw the pieces
//         for (int i = 0; i < DIMENSION; i++) {
//             for (int j = 0; j < DIMENSION; j++) {
//                 if (board[i][j] != '  ') {
//                     g.drawImage(images[getPieceIndex(board[i][j])], i * SQ_SIZE, j * SQ_SIZE, SQ_SIZE, SQ_SIZE, null);
//                 }
//             }
//         }

//         // Draw the selected piece
//         if (selectedRow != -1) {
//             g.drawImage(images[getPieceIndex(board[selectedRow][selectedCol])], selectedRow * SQ_SIZE, selectedCol * SQ_SIZE, SQ_SIZE, SQ_SIZE, null);
//         }
//     }

//     // Get the index of the piece
//     int getPieceIndex(char c) {
//         if (c == 'wP') {
//             return 0;
//         } else if (c == 'bP') {
//             return 1;
//         } else if (c == 'wR') {
//             return 2;
//         } else if (c == 'bR') {
//             return 3;
//         } else if (c == 'wN') {
//             return 4;
//         } else if (c == 'bN') {
//             return 5;
//         } else if (c == 'wB') {
//             return 6;
//         } else if (c == 'bB') {
//             return 7;
//         } else if (c == 'wQ') {
//             return 8;
//         } else if (c == 'bQ') {
//             return 9;
//         } else if (c == 'wK') {
//             return 10;
//         } else if (c == 'bK') {
//             return 11;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         ChessGame game = new ChessGame();
//         game.setVisible(true);
//     }
// }