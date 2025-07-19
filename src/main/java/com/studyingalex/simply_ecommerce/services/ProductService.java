package com.studyingalex.simply_ecommerce.services;

import com.studyingalex.simply_ecommerce.dto.ProductDTO;
import com.studyingalex.simply_ecommerce.entities.Product;
import com.studyingalex.simply_ecommerce.exceptions.ResourceNotFoundException;
import com.studyingalex.simply_ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> products = repository.findAll();
        return products.stream().map(this::entityToDto).toList();
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(long id) {
        Product product = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado com id: " + id));
        return entityToDto(product);
    }

    // Transforma entidade para DTO
    private ProductDTO entityToDto(Product entity) {
        return new ProductDTO(entity);
    }
}

