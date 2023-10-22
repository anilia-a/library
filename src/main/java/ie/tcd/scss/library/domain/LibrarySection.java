package ie.tcd.scss.library.domain;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class LibrarySection {
    @Id
    private String code;

    @Column
    private String name;

    protected LibrarySection() {
    }

    public LibrarySection(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibrarySection that)) return false;
        return Objects.equals(getCode(), that.getCode()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName());
    }

    @Override
    public String toString() {
        return "LibrarySection{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


