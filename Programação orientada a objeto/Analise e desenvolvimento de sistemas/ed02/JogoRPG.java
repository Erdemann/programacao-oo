class Personagem {
    String nome;
    int hp, ataque;
 
    Personagem(String nome, int hp, int ataque) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
    }
 
    void atacar(Personagem inimigo) {
        inimigo.defender(ataque);
        System.out.println(nome + " atacou " + inimigo.nome);
    }
 
    void defender(int dano) {
        hp -= dano;
    }
 
    void usarHabilidadeEspecial() {}
 
    void status() {
        System.out.println(nome + " | HP: " + hp + " | Ataque: " + ataque);
    }
}
 
class Guerreiro extends Personagem {
    Guerreiro(String nome) {
        super(nome, 150, 20);
    }
 
    void defender(int dano) {
        hp -= dano / 2;
    }
 
    void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Golpe Duplo!");
    }
}
 
class Mago extends Personagem {
    Mago(String nome) {
        super(nome, 100, 25);
    }
 
    void usarHabilidadeEspecial() {
        System.out.println(nome + " lançou Bola de Fogo!");
    }
}
 
class Arqueiro extends Personagem {
    Arqueiro(String nome) {
        super(nome, 120, 15);
    }
 
    void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Chuva de Flechas!");
    }
}
 
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");
 
        g.status();
        m.status();
        a.status();
 
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();
 
        g.status();
        m.status();
        a.status();
    }
}
