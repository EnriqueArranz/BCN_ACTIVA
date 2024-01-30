package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.entity.Fruit;
import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.repository.FruitRepository;
import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t02.n01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/fruits")
public class FruitController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Fruit fruit) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(fruit));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable("id") long fruitId) {
        Optional<Fruit> oFruit = userService.findById(fruitId);
        if (!oFruit.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oFruit);
    }
}
//    @PutMapping("/fruits/{id}")
//    public ResponseEntity<Fruit> updateFruit(@PathVariable("id") long id, @RequestBody Fruit fruit) {
//        Optional<Fruit> fruitData = fruitRepository.findById(id);
//        if (fruitData.isPresent()) {
//            Fruit _fruit = fruitData.get();
//            _fruit.setTitle(fruit.getTitle());
//            _fruit.setKgs(fruit.getKgs());
//            _fruit.setStock(fruit.isInStock());
//            return new ResponseEntity<>(fruitRepository.save(_fruit), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/fruits/{id}")
//    public ResponseEntity<HttpStatus> deleteFruit(@PathVariable("id") long id) {
//        try {
//            fruitRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @DeleteMapping("/fruits")
//    public ResponseEntity<HttpStatus> deleteAllFruits() {
//        try {
//            fruitRepository.deleteAll();
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/fruits/stock")
//    public ResponseEntity<List<Fruit>> findByStock() {
//        try {
//            List<Fruit> fruits = fruitRepository.findByStock(true);
//            if (fruits.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity<>(fruits, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/fruits")
//    public ResponseEntity<List<Fruit>> getAllFruits(@RequestParam(required = false) String title) {
//        try {
//            List<Fruit> fruits = new ArrayList<Fruit>();
//            if (title == null)
//                fruitRepository.findAll().forEach(fruits::add);
//            else
//                fruitRepository.findByTitleContaining(title).forEach(fruits::add);
//            if (fruits.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity<>(fruits, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}
