package com.vault.repository;

import com.vault.model.Prompt;
import com.vault.model.PromptStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PromptRepository extends JpaRepository<Prompt, Long> {
    Page<Prompt> findByStatus(PromptStatus status, Pageable pageable);
    Page<Prompt> findByCreatorId(Long creatorId, Pageable pageable);
    Page<Prompt> findByCategory(String category, Pageable pageable);
    List<Prompt> findByStatus(PromptStatus status);
    long countByStatus(PromptStatus status);
}