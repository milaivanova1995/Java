import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Tennis {

	private JFrame frmTennisPlayers;
	private JTable table;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tennis window = new Tennis();
					window.frmTennisPlayers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tennis() {
		initialize();
	}

	private void initialize() {
		frmTennisPlayers = new JFrame();
		frmTennisPlayers.setTitle("TENNIS   PLAYERS");
		frmTennisPlayers.setBounds(100, 100, 1000, 600);
		frmTennisPlayers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTennisPlayers.getContentPane().setLayout(null);

		JButton btnAdd = new JButton("Add Player");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add cr = new Add();
				cr.setModal(true);
				cr.setVisible(true);
				TennisPlayer player = cr.getMainPlayer();
				if (player != null) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] { player.getFname(), player.getLname(), player.getRanking(),
							player.getPoints(), player.getTournaments() });
				}
			}

		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(30, 509, 132, 41);
		frmTennisPlayers.getContentPane().add(btnAdd);

		JButton btnEdit = new JButton("Edit Player");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] selectedRow = table.getSelectedRows();
				if (selectedRow.length == 1) {
					String fname = (String) table.getValueAt(selectedRow[0], 0);
					String lname = (String) table.getValueAt(selectedRow[0], 1);
					int ranking = (int) table.getValueAt(selectedRow[0], 2);
					int points = (int) table.getValueAt(selectedRow[0], 3);
					short tournaments = (short) table.getValueAt(selectedRow[0], 4);
					TennisPlayer player = new TennisPlayer(fname, lname, ranking, points, tournaments);
					Edit ed = new Edit(player);
					ed.setModal(true);
					ed.setVisible(true);
					player = ed.getMainPlayer();
					table.setValueAt(player.getFname(), selectedRow[0], 0);
					table.setValueAt(player.getLname(), selectedRow[0], 1);
					table.setValueAt(player.getRanking(), selectedRow[0], 2);
					table.setValueAt(player.getPoints(), selectedRow[0], 3);
					table.setValueAt(player.getTournaments(), selectedRow[0], 4);
				}
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit.setBounds(172, 509, 132, 41);
		frmTennisPlayers.getContentPane().add(btnEdit);

		JButton btnDelete = new JButton("Delete Player");
		btnDelete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int rows = table.getSelectedRow();
				model.removeRow(rows);
			}

		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(309, 509, 132, 41);
		frmTennisPlayers.getContentPane().add(btnDelete);

		JButton btnCalculate = new JButton("Calculate Total Points");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int[] selectedRow = table.getSelectedRows();
				if (selectedRow.length == 1) {
					int points = (int) table.getValueAt(selectedRow[0], 3);
					short tournaments = (short) table.getValueAt(selectedRow[0], 4);
					Integer calulation = points * tournaments;
					JOptionPane.showMessageDialog(null, calulation);
				}

			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalculate.setBounds(451, 509, 180, 41);
		frmTennisPlayers.getContentPane().add(btnCalculate);

		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Tennis Players", "txt"));
					fileChooser.showDialog(null, "Choose a file...");

					File file = fileChooser.getSelectedFile();
					if (file == null) {
						return;
					}
					String path = file.getPath();
					if (path == null) {
						return;
					}

					if (path.endsWith(".txt")) {
						path = path;
					} else {
						path = path + ".txt";
					}

					FileWriter fileWriter = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileWriter);

					ArrayList<String> list = new ArrayList<String>();
					int row = table.getRowCount();

					for (int i = 0; i < row; i++) {
						String rowElements = String.format("%s;%s;%s;%s;%s", table.getValueAt(i, 0),
								table.getValueAt(i, 1), table.getValueAt(i, 2), table.getValueAt(i, 3),
								table.getValueAt(i, 4));
						list.add(rowElements);
					}

					for (String rowElements : list) {
						writer.append(rowElements);
						writer.newLine();
					}
					writer.close();

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error saving file!");
				}
				JOptionPane.showMessageDialog(null, "Successfully saved file!");
			}

		});
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExport.setBounds(716, 509, 114, 41);
		frmTennisPlayers.getContentPane().add(btnExport);

		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Text File", "txt"));
					fileChooser.showDialog(null, "Choose a file...");

					File file = fileChooser.getSelectedFile();

					List<String> listContent = Files.readAllLines(file.toPath());

					for (String line : listContent) {
						NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
						String[] row = line.split(";");
						String fname = row[0], lname = row[1];
						int ranking = 0, points = 0;
						short tournaments = 0;

						try {
							ranking = numberFormat.parse(row[2]).intValue();
							points = numberFormat.parse(row[3]).intValue();
							tournaments = numberFormat.parse(row[4]).shortValue();
						} catch (ParseException exx) {
							throw exx;
						}
						TennisPlayer player = new TennisPlayer(fname, lname, ranking, points, tournaments);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] { player.getFname(), player.getLname(), player.getRanking(),
								player.getPoints(), player.getTournaments() });
					}
					JOptionPane.showMessageDialog(null, "Successfully loaded file!");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while loading file!");

				}
			}
		});
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnImport.setBounds(840, 509, 114, 41);
		frmTennisPlayers.getContentPane().add(btnImport);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 279, 964, 219);
		frmTennisPlayers.getContentPane().add(scrollPane);

		Object[][] rowData = new Object[0][5];
		Object[] nameColumns = { "First Name", "Last Name", "Ranking", "Points", "Tournaments played" };

		table = new JTable();
		table = new JTable(new DefaultTableModel(rowData, nameColumns));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);

		JLabel lblImage = new JLabel("");
		lblImage.setIgnoreRepaint(true);
		lblImage.setAlignmentY(Component.TOP_ALIGNMENT);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/tennis.jpg"));
		lblImage.setIcon(img);
		lblImage.setBounds(48, 26, 887, 228);
		frmTennisPlayers.getContentPane().add(lblImage);

	}
}