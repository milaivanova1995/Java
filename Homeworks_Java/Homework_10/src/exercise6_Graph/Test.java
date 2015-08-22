package exercise6_Graph;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Creating a new matrix with size of 6");
		GraphMatrix graph = new GraphMatrix(6);


		graph.connectEdges(1, 6);
		graph.connectEdges(3, 3);
		graph.connectEdges(2, 5);
		graph.connectEdges(2, 5);
		graph.connectEdges(1, 1);
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Choose two edges (1-6) to check their connection: ");
			int edge1 = input.nextInt();
			int edge2 = input.nextInt();
			System.out.println(graph.areConnected(edge1, edge2));
			System.out.println("Choose two edges (1-6) to check if a path between them exists: ");
			int edge3 = input.nextInt();
			int edge4 = input.nextInt();
			System.out.println(graph.pathExists(edge3, edge4));
		}
		
		int[][] matrix = graph.getMatrix();
		System.out.println("\t|1|\t|2|\t|3|\t|4|\t|5|\t|6|");
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.format("|%d|\t", i + 1);
			for (int j = 0; j < matrix.length; j++) {
				System.out.format(" %d\t", matrix[i][j]);
			}
			System.out.println("\n");
		}
		input.close();
	}

}
