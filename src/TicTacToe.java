
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToe extends JFrame implements ActionListener {

	Main main = new Main();
	private static final long serialVersionUID = 1L;
	public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

	/**
	 *  
	 */

	public void b1ActionPerformed(ActionEvent e) {
		Main.move(b1);
		Main.player++;
		Main.checkWin();
	}

	public void b2ActionPerformed(ActionEvent e) {
		Main.move(b2);
		Main.player++;
		Main.checkWin();

	}

	public void b3ActionPerformed(ActionEvent e) {
		Main.move(b3);
		Main.player++;
		Main.checkWin();

	}

	public void b4ActionPerformed(ActionEvent e) {
		Main.move(b4);
		Main.player++;
		Main.checkWin();
	}

	public void b5ActionPerformed(ActionEvent e) {
		Main.move(b5);
		Main.player++;
		Main.checkWin();
	}

	public void b6ActionPerformed(ActionEvent e) {
		Main.move(b6);
		Main.player++;
		Main.checkWin();
	}

	public void b7ActionPerformed(ActionEvent e) {
		Main.move(b7);
		Main.player++;
		Main.checkWin();
	}

	public void b8ActionPerformed(ActionEvent e) {
		Main.move(b8);
		Main.player++;
		Main.checkWin();
	}

	public void b9ActionPerformed(ActionEvent e) {
		Main.move(b9);
		Main.player++;
		Main.checkWin();
	}

	public void b10ActionPerformed(ActionEvent e) {
		Main.player = 1;
		b1.setEnabled(true);
		b1.setText("");
		b2.setEnabled(true);
		b2.setText("");
		b3.setEnabled(true);
		b3.setText("");
		b4.setEnabled(true);
		b4.setText("");
		b5.setEnabled(true);
		b5.setText("");
		b6.setEnabled(true);
		b6.setText("");
		b7.setEnabled(true);
		b7.setText("");
		b8.setEnabled(true);
		b8.setText("");
		b9.setEnabled(true);
		b9.setText("");
	}

	public TicTacToe() {

		init();

	}

	public void init() {
		setTitle("Tic Tac Toe");
		JLabel l = new JLabel("TIC TAC TOE");
		l.setBounds(50, -30, 100, 100);
		l.setForeground(Color.blue);

		b1 = new JButton();
		b1.setBounds(10, 40, 50, 50);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1ActionPerformed(e);

			}

		});

		b2 = new JButton();
		b2.setBounds(10, 100, 50, 50);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b2ActionPerformed(e);

			}

		});

		b3 = new JButton();
		b3.setBounds(10, 160, 50, 50);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b3ActionPerformed(e);

			}

		});

		b4 = new JButton();
		b4.setBounds(70, 40, 50, 50);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b4ActionPerformed(e);

			}

		});
		b5 = new JButton();
		b5.setBounds(70, 100, 50, 50);
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b5ActionPerformed(e);

			}

		});

		b6 = new JButton();
		b6.setBounds(70, 160, 50, 50);
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b6ActionPerformed(e);

			}

		});

		b7 = new JButton();
		b7.setBounds(130, 40, 50, 50);
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b7ActionPerformed(e);

			}

		});

		b8 = new JButton();
		b8.setBounds(130, 100, 50, 50);
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b8ActionPerformed(e);

			}

		});

		b9 = new JButton();
		b9.setBounds(130, 160, 50, 50);
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b9ActionPerformed(e);

			}
		});

		b10 = new JButton("Reset");
		b10.setBounds(70, 220, 50, 50);
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				b10ActionPerformed(e);

			}

		});

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(l);

		setSize(200, 300);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.cyan);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
