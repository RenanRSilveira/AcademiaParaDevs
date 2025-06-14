public class Aula14{
    
    public static void main(String[] args){
        User userA = new User("Renan", "Rosa");
        User userB = new User("Renan", "Rosa");

        System.out.println(userA);
        System.out.println(userA.hashCode());
        
        System.out.println(userB);
        System.out.println(userB.hashCode());

        System.out.println(userA.equals(userB));
        
    }


}

class User{
    private String nome, sobrenome;

    public User(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (sobrenome == null) {
            if (other.sobrenome != null)
                return false;
        } else if (!sobrenome.equals(other.sobrenome))
            return false;
        return true;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
}