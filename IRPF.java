package app;

public class IRPF{
	private float salario;
	private float contribuicaoPrevidenciaria;
	private String[] dependentes;

	public IRPF(){
	dependentes = new String[0];
    }

        public void cadastrarSalario(float salario){
        this.salario += salario;
    }

    public float getoTotalSalario(){
        return this.salario;  // Somente o primeiro teste passou tilizando a técnica de falsificação
    }

    public void cadastrarPrevidenciaOficial(float contribuicaoPrevidenciaria){
        this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
    }

    public float getPrevidenciaOficial(){
        return this.contribuicaoPrevidenciaria;
    }

    public void cadastrarDependente(String nome){
        // Criar nova posição no vetor de dependentes
        String[] temp = new String[dependentes.length + 1];
        for(int i = 0; i < dependentes.length; i++){
            temp[i] = dependentes[i];
        }
        // Alocar novo dependente no vetor
        temp[dependentes.length] = nome;

        // Atualizar referências do vetor de dependentes
        dependentes = temp;
    }

    public float getDeducaoDependentes(){
        return dependentes.length * 189.59f;
        
        // if(dependentes.length == 1){
        //	return 189.59f;  // Técnica de falsificação
        // }
        // else if(dependentes.length > 1){
        //	return 379.18f;  // Técnica de falsificação / duplicação
        // }
        // else{
        //	return 0f;
        // }
    }
}
