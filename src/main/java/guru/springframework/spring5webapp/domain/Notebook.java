package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

@Entity
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private Integer page;
    private Float price;

    public Notebook() {

    }

    public Notebook(int page, float price) {
        this.page = page;
        this.price = price;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    public int getPage() {
        return this.page;
    }
    public float getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook notebook = (Notebook) o;

        return id != null ? id.equals(notebook.id) : notebook.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
