package com.promptvault.repository;

import com.promptvault.model.Prompt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromptRepository extends JpaRepository<Prompt, Long> {
    @Query("SELECT p FROM Prompt p WHERE p.title ILIKE %:searchTerm% OR p.description ILIKE %:searchTerm%")
    List<Prompt> searchByTitleOrDescription(@Param("searchTerm") String searchTerm);

    List<Prompt> findByCategory(String category);
}