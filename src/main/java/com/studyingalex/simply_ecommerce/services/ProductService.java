package com.studyingalex.simply_ecommerce.services;

import com.studyingalex.simply_ecommerce.dto.ProductDTO;
import com.studyingalex.simply_ecommerce.entities.Product;
import com.studyingalex.simply_ecommerce.exceptions.ResourceNotFoundException;
import com.studyingalex.simply_ecommerce.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> products = repository.findAll(pageable);
        return products.map(x -> modelMapper.map(x, ProductDTO.class));
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(long id) {
        Product product = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado com id: " + id));
        return modelMapper.map(product, ProductDTO.class);
    }
}

