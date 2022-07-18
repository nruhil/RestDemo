package com.neeraj.netflixschema.repo;

import com.neeraj.netflixschema.Model.Users;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "userRepo")
public interface UserRepo extends JpaRepository<Users,Long> {
}
