
public abstract class  Persona {
    private String nome;
    private String cognome;
    

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        
        
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    public abstract int getCodice();
    
    
}
