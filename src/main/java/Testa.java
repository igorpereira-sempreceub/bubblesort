import java.util.*;

public class Testa {

	public static void main(String[] args) {
		List<Integer> opa = new ArrayList<Integer>(Arrays.asList(1, 10, 5, 3));
		
		
		BubbleSort s = new BubbleSort(opa);
		s.getListaOrdenada();
		
	}

}
