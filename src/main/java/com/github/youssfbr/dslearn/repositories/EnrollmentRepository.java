package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.Enrollment;
import com.github.youssfbr.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
