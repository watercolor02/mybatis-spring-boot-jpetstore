package com.kazuki43zoo.jpetstore.mapper;

import com.kazuki43zoo.jpetstore.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
