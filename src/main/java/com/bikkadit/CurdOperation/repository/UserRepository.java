package com.bikkadit.CurdOperation.repository;

import com.bikkadit.CurdOperation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
