package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.repository;

import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {
    List<Fruit> findByTitleContaining(String name);

    List<Fruit> findByStock(boolean stock);
}
