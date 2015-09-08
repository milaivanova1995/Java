import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Add extends JDialog {

	private User user;

	public User getUser() {
		return user;
	}

	public Add() {
		getContentPane().setBackground(new Color(230, 230, 250));
		setBounds(100, 100, 300, 200);
		getContentPane().setLayout(null);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 235, 205));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(176, 116, 98, 35);
		getContentPane().add(btnCancel);

		JLabel lblId = new JLabel("ID: ");
		lblId.setBounds(38, 24, 70, 19);
		getContentPane().add(lblId);

		JLabel lblNumbers = new JLabel("Numbers:");
		lblNumbers.setBounds(38, 54, 70, 19);
		getContentPane().add(lblNumbers);

		JFormattedTextField formattedTextFieldID = new JFormattedTextField();
		formattedTextFieldID.setBounds(110, 23, 98, 20);
		// formattedTextFieldID.setValue(new Long(0L));
		getContentPane().add(formattedTextFieldID);

		JFormattedTextField formattedTextFieldNumbers = new JFormattedTextField();
		formattedTextFieldNumbers.setBounds(110, 53, 98, 20);
		// formattedTextFieldNumbers.setValue(new String(""));
		getContentPane().add(formattedTextFieldNumbers);

		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(new Color(224, 255, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				user = new User();
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);

				long ID = 0;
				String str = null;

				str = formattedTextFieldNumbers.getText();
				String[] userNumbers = str.split("\\s");
				user.setUserNumbers(userNumbers);
				try {
					ID = numberFormat.parse(formattedTextFieldID.getText()).longValue();
					// str =
					// numberFormat.parse(formattedTextFieldNumbers.getText()).intValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error while parsing");
					ex.getStackTrace();
				}

				if (formattedTextFieldID == null || formattedTextFieldID.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter a valid ID.");
				} else if (formattedTextFieldNumbers == null || formattedTextFieldNumbers.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter valid numbers");
				} else {
					user.setID(ID);
					user.getUserNumbersString();
					setVisible(false);
				}
			}
		});
		btnAdd.setBounds(10, 116, 98, 35);
		getContentPane().add(btnAdd);

	}
}
