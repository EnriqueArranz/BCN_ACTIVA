package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.service;

import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.entity.Fruit;
import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {
    public Iterable<Fruit> findAll();

//    public Page<Fruit> findAll(Pageable pageable);

    public Optional<Fruit> findById(Long id);

    public Fruit save(Fruit fruit);

    public void deleteById(Long id);
}
