package n1exercici8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringModifier sm = (text) -> new StringBuilder(text).reverse().toString();

        System.out.println(sm.reverse("Mal si le das la fe falsa del Islam"));
	}

}
