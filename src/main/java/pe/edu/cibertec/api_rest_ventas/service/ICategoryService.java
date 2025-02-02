package pe.edu.cibertec.api_rest_ventas.service;

import pe.edu.cibertec.api_rest_ventas.model.bd.Category;
import pe.edu.cibertec.api_rest_ventas.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> listarCategorias();
    Category guardarCategoria(Category category);
    Optional<Category> obtenerCategoriaxId(Integer id);
}
