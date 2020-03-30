import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Main {

	public static int player = 1;
	public static String mark;
	public static TicTacToe board = new TicTacToe();

	public static void main(String[] args) {

		if (board.isVisible() == false) {
			board.setVisible(true);
		}

	}

	public static void move(JButton b) {

		player = (player % 2 == 1) ? 1 : 2;
		mark = (player == 1) ? "X" : "O";
		b.setText(mark);
		b.setEnabled(false);
	}

	public static void checkWin() {

		if (board.b1.getText().equals(mark) && board.b2.getText().equals(mark) && board.b3.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");

		} else if (board.b1.getText().equals(mark) && board.b4.getText().equals(mark)
				&& board.b7.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");
		} else if (board.b1.getText().equals(mark) && board.b5.getText().equals(mark)
				&& board.b9.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");

		} else if (board.b3.getText().equals(mark) && board.b5.getText().equals(mark)
				&& board.b7.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");

		} else if (board.b3.getText().equals(mark) && board.b6.getText().equals(mark)
				&& board.b9.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");

		} else if (board.b7.getText().equals(mark) && board.b8.getText().equals(mark)
				&& board.b9.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");

		} else if (board.b4.getText().equals(mark) && board.b5.getText().equals(mark)
				&& board.b6.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");

		} else if (board.b2.getText().equals(mark) && board.b5.getText().equals(mark)
				&& board.b8.getText().equals(mark)) {
			JOptionPane.showMessageDialog(board, "PLAYER " + (player - 1) + " WINS!");

		}

		else if (!board.b1.getText().equals("") && !board.b2.getText().equals("") && !board.b3.getText().equals("")
				&& !board.b4.getText().equals("") && !board.b5.getText().equals("") && !board.b6.getText().equals("")
				&& !board.b7.getText().equals("") && !board.b8.getText().equals("") && !board.b9.getText().equals("")) {
			JOptionPane.showMessageDialog(board, "NO WINNER !");

		}

	}

}
