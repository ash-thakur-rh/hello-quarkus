package org.ashish.dto;

public class PersonDTO {
    private String name;
    private java.time.LocalDateTime retrievedAt;

    public PersonDTO() {
    }

    public PersonDTO(String name, java.time.LocalDateTime retrievedAt) {
        this.name = name;
        this.retrievedAt = retrievedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.time.LocalDateTime getRetrievedAt() {
        return retrievedAt;
    }

    public void setRetrievedAt(java.time.LocalDateTime retrievedAt) {
        this.retrievedAt = retrievedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return java.util.Objects.equals(name, personDTO.name) && java.util.Objects.equals(retrievedAt, personDTO.retrievedAt);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, retrievedAt);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", retrieved-at=" + retrievedAt +
                '}';
    }
}
