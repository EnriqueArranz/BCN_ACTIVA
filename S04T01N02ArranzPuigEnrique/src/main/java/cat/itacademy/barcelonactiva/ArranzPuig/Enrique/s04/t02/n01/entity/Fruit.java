package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String title;
    @Column(name = "kilos")
    private int kgs;
    @Column(name = "stock")
    private boolean stock;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getKgs() {
        return kgs;
    }

    public void setKgs(int kgs) {
        this.kgs = kgs;
    }

    public boolean isStock() {
        return stock;
    }

    public boolean isInStock() {
        return stock;
    }
}
