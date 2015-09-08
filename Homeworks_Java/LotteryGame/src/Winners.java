import java.awt.*;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

@SuppressWarnings("serial")
public class Winners extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	ArrayList<User> winners;

	public Winners(String[] luckyNumbers, ArrayList<User> users) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 207);
		contentPanel.add(scrollPane);

		table = new JTable();
		Object[][] rowData = new Object[0][2];
		Object[] columns = { "ID", "Numbers" };
		table = new JTable(new DefaultTableModel(rowData, columns));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);

		winners = new ArrayList<User>();

		User winner = null;
		for (int i = 0; i < users.size(); i++) {
			long ID = users.get(i).getID();

			String[] userNumbers = users.get(i).getUserNumbers();

			int hitNumbers = 0;
			for (int j = 0; j < userNumbers.length; j++) {
				for (int k = 0; k < luckyNumbers.length; k++) {
					if (userNumbers[j].equals(luckyNumbers[k])) {
						hitNumbers++;
					}
				}
			}

			if (hitNumbers > 2) {
				winner = new User(ID, users.get(i).getUserNumbers());
				winners.add(winner);
			}
		}

		for (int i = 0; i < winners.size(); i++) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] { winners.get(i).getID(), winners.get(i).getUserNumbersString() });
		}
	}

	public ArrayList<User> getWinners() {
		return this.winners;
	}
}
