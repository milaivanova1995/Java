import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class LotaryGame {

	private JFrame frame;
	private JTable table;
	private String[] luckyNumber;
	ArrayList<String> list;
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<User> winners = null;
	String luckyNumbers = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LotaryGame window = new LotaryGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LotaryGame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(200, 0, 800, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnAdd = new JButton("Add ");
		btnAdd.setBackground(new Color(224, 255, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add cr = new Add();
				cr.setModal(true);
				cr.setVisible(true);
				User user = cr.getUser();
				if (user != null) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] { user.getID(), user.getUserNumbersString() });
				}
				users.add(user);
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(10, 646, 157, 38);
		frame.getContentPane().add(btnAdd);

		JButton btnShowLuckyNumbers = new JButton("Show Lucky Numbers");
		btnShowLuckyNumbers.setBackground(new Color(250, 235, 215));
		btnShowLuckyNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Random rand = new Random();

				luckyNumber = new String[5];
				for (int number = 0; number < 5; number++) {
					Integer randomNumber = rand.nextInt(30) + 1;
					luckyNumber[number] = randomNumber.toString();
					luckyNumbers += luckyNumber[number] + ", ";
				}
				int index = luckyNumbers.lastIndexOf(",");
				luckyNumbers = luckyNumbers.substring(0, index);
				JOptionPane.showMessageDialog(null, "The winning numbers are: " + luckyNumbers);

			}
		});
		btnShowLuckyNumbers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnShowLuckyNumbers.setBounds(201, 646, 187, 38);
		frame.getContentPane().add(btnShowLuckyNumbers);

		JButton btnShowWinners = new JButton("Show Winners");
		btnShowWinners.setBackground(new Color(230, 230, 250));
		btnShowWinners.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Winners win = new Winners(luckyNumber, users);
				win.setVisible(true);
				win.setModal(true);

				winners = win.getWinners();
			}
		});
		btnShowWinners.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnShowWinners.setBounds(412, 646, 157, 38);
		frame.getContentPane().add(btnShowWinners);

		JButton btnExport = new JButton("Export");
		btnExport.setBackground(new Color(248, 248, 255));
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				chooser.setCurrentDirectory(new java.io.File("."));
				chooser.setDialogTitle("Save folder");
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.setAcceptAllFileFilterUsed(false);

				if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

					String path = chooser.getSelectedFile() + "\\";
					if (path == null || path == "") {
						return;
					}

					String usersPath = path + "users.txt";
					String luckyNumbersPath = path + "luckyNumbers.txt";
					String winnersPath = path + "winners.txt";

					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter(usersPath, true));

						list = new ArrayList<String>();

						int rowCount = table.getRowCount();

						for (int i = 0; i < rowCount; i++) {
							String line = String.format("%s : %s", table.getValueAt(i, 0), table.getValueAt(i, 1));
							list.add(line);
						}

						for (String line : list) {
							writer.append(line);
							writer.newLine();
						}

						writer.close();
						writer = new BufferedWriter(new FileWriter(luckyNumbersPath, true));
						writer.write(luckyNumbers);

						writer.close();
						writer = new BufferedWriter(new FileWriter(winnersPath, true));

						for (int i = 0; i < winners.size(); i++) {
							String ID = String.valueOf(winners.get(i).getID());
							writer.write(ID);
							writer.write(": ");

							writer.write(winners.get(i).getUserNumbersString() + "numbers");
							writer.newLine();
						}

						writer.close();
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "Error while saving file!");
						ex.printStackTrace();
					}

					JOptionPane.showMessageDialog(null, "Successfully saved in file!");

					System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
					System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
				} else {
					System.out.println("No Selection ");
				}

			}
		});
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExport.setBounds(593, 646, 150, 38);
		frame.getContentPane().add(btnExport);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 370, 764, 265);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		Object[][] rowData = new Object[0][2];
		Object[] columns = { "ID", "Numbers" };
		table = new JTable(new DefaultTableModel(rowData, columns));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);

		JLabel lblImage = new JLabel("");
		lblImage.setIgnoreRepaint(true);
		lblImage.setAlignmentY(Component.TOP_ALIGNMENT);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/lot.jpg"));
		lblImage.setIcon(img);
		lblImage.setBounds(118, 21, 573, 299);
		frame.getContentPane().add(lblImage);

	}
}
