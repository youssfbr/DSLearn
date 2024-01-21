package com.github.youssfbr.dslearn.services;

import com.github.youssfbr.dslearn.dtos.DeliverRevisionDTO;
import com.github.youssfbr.dslearn.entities.Deliver;
import com.github.youssfbr.dslearn.repositories.DeliverRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {
    private final DeliverRepository repository;

    public DeliverService(DeliverRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO dto) {
        final Deliver deliver = repository.getOne(id);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        repository.save(deliver);
    }

}
