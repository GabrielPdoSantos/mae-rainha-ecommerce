package br.com.maerianha.ecommerce.usuario;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    @Column(unique = true)
    String email;
    String senha;
    Role role;
    LocalDate dataCadastro = LocalDate.now();

}
