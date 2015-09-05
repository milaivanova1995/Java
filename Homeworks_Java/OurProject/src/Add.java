import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Add extends JDialog {

	private TennisPlayer mainPlayer;

	public TennisPlayer getMainPlayer() {
		return mainPlayer;
	}

	public Add() {
		setTitle("Add Tennis Player");
		setBounds(100, 100, 450, 330);
		getContentPane().setLayout(null);

		JFormattedTextField formattedFnameTextField = new JFormattedTextField();
		formattedFnameTextField.setBounds(150, 11, 274, 25);
		formattedFnameTextField.setValue(new String(""));
		getContentPane().add(formattedFnameTextField);

		JFormattedTextField formattedLnameTextField = new JFormattedTextField();
		formattedLnameTextField.setBounds(150, 55, 274, 25);
		formattedLnameTextField.setValue(new String(""));
		getContentPane().add(formattedLnameTextField);

		JFormattedTextField formattedRankingTextField = new JFormattedTextField();
		formattedRankingTextField.setBounds(150, 101, 274, 25);
		formattedRankingTextField.setValue(new Integer(0));
		getContentPane().add(formattedRankingTextField);

		JFormattedTextField formattedPointsTextField = new JFormattedTextField();
		formattedPointsTextField.setBounds(150, 153, 274, 25);
		formattedPointsTextField.setValue(new Integer(0));
		getContentPane().add(formattedPointsTextField);

		JFormattedTextField formattedTournamentTextField = new JFormattedTextField();
		formattedTournamentTextField.setBounds(150, 196, 274, 25);
		formattedTournamentTextField.setValue(new Short((short) 0));
		getContentPane().add(formattedTournamentTextField);

		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(23, 11, 96, 25);
		getContentPane().add(lblNewLabel);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(23, 55, 96, 25);
		getContentPane().add(lblLastName);

		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRanking.setBounds(23, 101, 96, 25);
		getContentPane().add(lblRanking);

		JLabel lblPoints = new JLabel("Points");
		lblPoints.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPoints.setBounds(23, 153, 96, 25);
		getContentPane().add(lblPoints);

		JLabel lblTournament = new JLabel("Tournament");
		lblTournament.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTournament.setBounds(23, 196, 96, 25);
		getContentPane().add(lblTournament);

		JButton btnNewButton = new JButton("Add Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPlayer = new TennisPlayer();
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);

				String fname = formattedFnameTextField.getText();
				String lname = formattedLnameTextField.getText();
				int ranking = 0;
				int points = 0;
				short tournaments = 0;

				try {
					ranking = numberFormat.parse(formattedRankingTextField.getText()).intValue();
					points = numberFormat.parse(formattedPointsTextField.getText()).intValue();
					tournaments = numberFormat.parse(formattedTournamentTextField.getText()).shortValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error while parsing");
					ex.getStackTrace();

				}
				if (formattedFnameTextField == null || formattedFnameTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter valid first name");
				} else if (formattedLnameTextField == null || formattedFnameTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter valid last name");
				} else if (formattedRankingTextField == null || formattedRankingTextField.getText().equals("")
						|| ranking <= 0) {
					JOptionPane.showMessageDialog(null, "Please enter valid ranking");
				} else if (formattedPointsTextField == null || formattedPointsTextField.getText().equals("")
						|| points < 0) {
					JOptionPane.showMessageDialog(null, "Please enter valid points");
				} else if (formattedTournamentTextField == null || formattedTournamentTextField.getText().equals("")
						|| tournaments < 0) {
					JOptionPane.showMessageDialog(null, "Please enter valid number of tournaments played");
				} else {
					mainPlayer.setFname(fname);
					mainPlayer.setLname(lname);
					mainPlayer.setRanking(ranking);
					mainPlayer.setPoints(points);
					mainPlayer.setTournaments(tournaments);
					setVisible(false);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(23, 243, 160, 38);
		getContentPane().add(btnNewButton);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(264, 243, 160, 38);
		getContentPane().add(btnCancel);

	}
}