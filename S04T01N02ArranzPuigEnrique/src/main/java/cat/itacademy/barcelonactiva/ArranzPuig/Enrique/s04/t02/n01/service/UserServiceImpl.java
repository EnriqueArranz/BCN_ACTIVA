package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.service;

import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.entity.Fruit;
import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.repository.FruitRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private FruitRepository fruitRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Fruit> findAll() {
        return fruitRepository.findAll();
    }

//    @Transactional(readOnly = true)
//    @Override
//    public Page<Fruit> findAll(Pageable pageable) {
//        return fruitRepository.findAll(pageable);
//    }
    @Transactional(readOnly = true)
    @Override
    public Optional<Fruit> findById(Long id) {
        return fruitRepository.findById(id);
    }
    @Transactional
    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
        fruitRepository.deleteById(id);
    }
}
