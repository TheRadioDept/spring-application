package com.netrunner.main_page.Repo;

import com.netrunner.main_page.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
