
package com.OchoBits_Reto1.reto1.Interface;

import com.OchoBits_Reto1.reto1.Modelo.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author lei20
 */
public interface UserCrudRepository extends CrudRepository< User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}
