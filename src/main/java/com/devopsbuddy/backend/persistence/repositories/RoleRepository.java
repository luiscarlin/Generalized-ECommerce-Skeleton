package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by andrewburns on 11/8/16.
 */

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
}
