public class PracticeProblem {

	public static int find(int[] array, int number) {

		//int [] numArray={1,7,5,3,8,5};

		//int num=5;
		int index=-1;

		int occurances=0;
		for (int i =0; i < array.length; i++){
			if(array[i]==number){
				occurances++;
				index = i;
				i=array.length;
			}
		}
		return index;

	}

	public static int findLast(String[] array, String string){
		int index=-1;

		int occurances=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==string){
				occurances++;
				index=i;
				

			}
		}
		return index;
	}

	public static int findSecond(char[] array, char character){
		int index=-1;

		int occurances=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==character && occurances < 2){
				occurances++;
				index=i;
				
			}
		}
		return index;
	}

	

}
