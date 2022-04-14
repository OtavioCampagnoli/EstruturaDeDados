/**
 *
 * @author mfpledon
 */
package aula05.ExemplosAula05;


class Trabalhador {

   private String nome;
   private float salario;
   private char sexo;

   public Trabalhador(){
      nome = "-";
      salario = 0;
      sexo = '-';
   }

   public Trabalhador(String inNome, float inSalario,
   	                  char inSexo) {
      setNome(inNome);
      setSalario(inSalario);
      setSexo(inSexo);
   }

   public void setNome(String inNome) {
      nome = inNome;
   }

   public void setSalario(float inSalario) {
      if (inSalario>0) salario = inSalario; else salario=0;
   }

   public void setSexo(char inSexo) {
      sexo = '-';
      if(inSexo=='F' || inSexo=='M') sexo = inSexo;
   }


  public String getNome() {
  	return nome;  //ou this.nome
  }

  public float getSalario() {
  	return salario;  //ou this.salario
  }

  public String getSalarioStr() {
  	return "R$" + salario;
  }

  public char getSexo() {
  	return sexo;
  }

   public String toString()  {
       return(getNome() + ", sal�rio mensal: R$" + getSalario()
       	    + ", sal�rio anual: R$" + salarioAnual()
            + ", sexo: " + getSexo());
       //ou:  return(nome + ", sal�rio mensal:" + salario + ", sal�rio anual:" + salarioAnual() + ", sexo:" + sexo);
   }

   public float salarioAnual()  {
   	  return(salario * 13 + salario/3);
   }

} //fim da classe Trabalhador

