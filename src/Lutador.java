public class Lutador implements Controlador {
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float peso, altura;

    //métodos 

    //construtor
    public Lutador(String no, String na, int id, float pe, float al, int vi, int de, int em){
            this.SetNome(no); 
            this.SetNacionalidade(na); 
            this.SetIdade(id);
            this.SetPeso(pe);
            this.SetAltura(al);
            this.SetVitorias(vi);
            this.SetDerrotas(de);
            this.SetEmpates(em);
    }


    //Método get e set
    public void SetNome(String no){
        this.nome = no;
    }
    public String GetNome(){
        return this.nome;
    }

    public void SetNacionalidade(String na){
        this.nacionalidade = na;
    }
    public String GetNacionalidade(){
        return this.nacionalidade;
    }

    public void SetPeso(float pe){
        this.peso = pe;
        this.SetCategoria();
    }
    public float GetPeso(){
        return this.peso;
        

    }
    public void SetCategoria(){
        if(this.GetPeso() < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.GetPeso()  <=70.3){
            this.categoria = "Leve";
        }
        else if(this.GetPeso() <=83.9){
            this.categoria = "Médio";
        }
        else if(this.GetPeso()  <=120.2){
            this.categoria = "Pesado";
        }
        else{
            System.out.println("Inválido");
        }
    }
    public String GetCategoria(){
        return this.categoria;
    }

  
    public void SetIdade(int id){
        this.idade = id;
    }
    public int GetIdade(){
        return this.idade;
    }

    public void SetVitorias(int vi){
        this.vitorias = vi;
    }
    public int GetVitorias(){
        return this.vitorias;
    }

    public void SetDerrotas(int de){
        this.derrotas = de;
    }
    public int GetDerrotas(){
        return this.derrotas;
    }

    public void SetEmpates(int em){
        this.empates = em;
    }
    public int GetEmpates(){
        return this.empates;
    }

   
    public void SetAltura(float al){
        this.altura = al;
    }
    public float GetAltura(){
        return this.altura;
    }





    //métodos específicos
    @Override
    public void ganharLuta() {
      
        this.SetVitorias(this.GetVitorias() + 1);
    }


    @Override
    public void empatarLuta() {
        this.SetEmpates(this.GetEmpates() + 1);
    }


    @Override
    public void perderLuta() {
        
        this.SetDerrotas(this.GetDerrotas() + 1);
    }

    @Override 
    public void apresentarLuta(){
        System.out.println("Lá vem ele, o grande lutador: " + this.GetNome());
        System.out.println("Veio diretamento do(a): " + this.GetNacionalidade());
        System.out.println("Com apenas: " + this.GetIdade() + " anos");
        System.out.println("Pensando atualmente " + this.GetPeso() + "Kg e com " + this.GetAltura() + "m de altura");
        System.out.println("Vitórias: " + this.GetVitorias());
        System.out.println("Derrotas: " + this.GetDerrotas());
        System.out.println("Empates: " + this.GetEmpates());
    }

    @Override
    public void statusLutas(){
       System.out.println("Categoria: " + this.GetCategoria());
       System.out.println("Vitórias: " + this.GetVitorias());
       System.out.println("Derrotas: " + this.GetDerrotas());
       System.out.println("Empates: " + this.GetEmpates());
    }





}
