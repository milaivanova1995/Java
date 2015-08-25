package exercise7;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Tree root = new Tree(1);
		{
			Tree node2 = root.addChild(2);
			{
				Tree node5 = node2.addChild(5);
				Tree node6 = node2.addChild(6);
				Tree node7 = node2.addChild(7);
			}
			Tree node3 = root.addChild(3);
			Tree node4 = root.addChild(4);
			{
				Tree node8 = node4.addChild(8);
				Tree node9 = node4.addChild(9);
			}
		}
		
		//
//		Tree root = new Tree(1);
//		{
//			Tree node2 = root.addChild(2);
//			{
//				Tree node6 = node2.addChild(6);
//				Tree node7 = node2.addChild(7);
//				{
//					Tree node14 = node7.addChild(14);
//				}
//			}
//			Tree node3 = root.addChild(3);
//			{
//				Tree node8 = node3.addChild(8);
//				Tree node9 = node3.addChild(9);
//			}
//			Tree node4 = root.addChild(4);
//			{
//				Tree node10 = node4.addChild(10);
//				Tree node11 = node4.addChild(11);
//			}
//			Tree node5 = root.addChild(5);
//			{
//				Tree node12 = node5.addChild(12);
//				Tree node13 = node5.addChild(13);
//			}
//		}	
		
		root.bfs(root);	

	}

}
