package lista;

public class Teste {

	public static void main(String[] args) {
//		ListaEncad list = new ListaEncad();
//		list.InserirPrim(3);
//		list.InserirPrim(5);
//		list.InserirPrim(7);
//		list.InserirPrim(19);
//		list.InserirUlt(100);
//		list.Inserir(4, 3);
//		list.Vizualizar();
//		System.out.println(list.DeletarPrim());
//		list.Vizualizar();
//		System.out.println(list.DeletarUlt());
//		list.Vizualizar();
//		System.out.println(list.deletar(1));
//		list.Vizualizar();
		ListaEncad<Integer> list = new ListaEncad<>();
		list.InserirPrim(3);
		list.InserirPrim(5);
		list.InserirPrim(7);
		list.InserirPrim(19);
		list.Vizualizar();
		list.DeletarUlt();
		list.Vizualizar();
		list.InserirUlt(3);
		list.Vizualizar();
		list.DeletarPrim();
		list.Vizualizar();
		list.DeletarPrim();
		list.Vizualizar();
		list.DeletarPrim();
		list.Vizualizar();
		list.DeletarPrim();
		list.Vizualizar();
		list.DeletarPrim();
		list.Vizualizar();
	}

}
