package com.bytesoft.backend.controlador;

import com.bytesoft.backend.modelo.Estadistica;
import com.bytesoft.backend.servicio.ServicioEstadistica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mainstats")
public class ControladorEstadistica {
    @Autowired
    private ServicioEstadistica servicioEstadistica;

    @GetMapping("/about")
    @ResponseBody
    public ResponseEntity<Estadistica> test(){
        int a =22;
        Estadistica b = new Estadistica("That's cum","bro","bro",a);
        return new ResponseEntity<Estadistica>(b, HttpStatus.OK);
    }


    @GetMapping("/cum")
    @ResponseBody
    public String cumming(){
        return "That's cum bro";
    }
//    @GetMapping("/")
//    public List<User> list() {
//        return userService.listAllUser();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<User> get(@PathVariable Integer id) {
//        try {
//            User user = userService.getUser(id);
//            return new ResponseEntity<User>(user, HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//    }
//    @PostMapping("/")
//    public void add(@RequestBody User user) {
//        userService.saveUser(user);
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
//        try {
//            User existUser = userService.getUser(id);
//            user.setId(id);
//            userService.saveUser(user);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Integer id) {
//
//        userService.deleteUser(id);
//    }
}