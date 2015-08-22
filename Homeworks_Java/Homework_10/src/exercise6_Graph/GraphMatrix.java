package exercise6_Graph;

public class GraphMatrix {

	protected int[][] matrix;
	protected int vertexCount;
	
	public GraphMatrix(int vertexCount) {
		matrix(vertexCount);
	}
	
	public int[][] getMatrix() {
		return matrix;
	}
	    
	public void matrix(int vertexCount) {
		if (vertexCount >= 0) {
			this.vertexCount = vertexCount;
			matrix = new int[vertexCount][vertexCount];
			for (int i = 0; i < vertexCount; i++) {
				for (int j = 0; j < vertexCount; j++) {
					matrix[i][j] = 0;
				}
			}
			System.out.format("Graph matrix with %d edges created.\n", vertexCount);
		}
	}
	
	public boolean areConnected(int edge1, int edge2) {
		if (matrix[edge1 - 1][edge2 - 1] == 1 && matrix[edge2 - 1][edge1 - 1] == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void connectEdges(int edge1, int edge2) {
		if (areConnected(edge1, edge2)) {
			System.out.format("There is already a connection between edge %d and edge %d\n", edge1, edge2);
		} else {
			matrix[edge1 - 1][edge2 - 1] = 1;
			matrix[edge2 - 1][edge1 - 1] = 1;
		}
	}
    
    public boolean pathExists(int edge1, int edge2) {
    	if (matrix[edge1 - 1][edge2 - 1] == 1 && matrix[edge2 - 1][edge1 - 1] == 1) {
			return true;
		}
    	for (int i = 0; i < vertexCount; i++) {
    		if (matrix[i][edge2 - 1] == 1) {
    			return pathExists(i + 1, edge2);
    		}
    	}
    	return false;
    }

}
