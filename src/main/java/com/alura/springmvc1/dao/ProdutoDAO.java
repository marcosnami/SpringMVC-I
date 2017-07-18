package com.alura.springmvc1.dao;

import com.alura.springmvc1.model.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by MarcosNami on 7/16/2017.
 */
@Repository
@Transactional
public class ProdutoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void gravar(Produto produto) {
        entityManager.persist(produto);
    }

    public List<Produto> listar() {
        return entityManager.createQuery("select p from Produto p").getResultList();
    }
}
