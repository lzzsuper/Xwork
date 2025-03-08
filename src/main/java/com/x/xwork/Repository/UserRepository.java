package com.x.xwork.Repository;

import com.x.xwork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 使用 JPA 提供的基本查询方法
    Optional<User> findByUsername(String username);
}
