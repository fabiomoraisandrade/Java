package lambdas;

//Essa notação é para interfaces que tenham apenas 1 método
//Se a interface tiver mais de um método e não tiver essa anotation, não será possível criar os lambdas (arrowfunctions) do CalculoTeste2
@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
}
