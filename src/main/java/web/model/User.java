package web.model;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="email")
    private String email;
    public User(){}
    public User(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    @Transactional(readOnly = true)
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Transactional(readOnly = true)
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Transactional(readOnly = true)
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    @Transactional(readOnly = true)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString() {
        return "User {" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email=" + email +
                '}';
    }
}