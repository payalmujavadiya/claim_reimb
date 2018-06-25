package com.coviam.reimbursement.claims.service.api;

import com.coviam.reimbursement.claims.entity.Reimbursement;
import com.coviam.reimbursement.claims.entity.ReimbursementItem;
import com.coviam.reimbursement.claims.entity.Status;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ReimbursementService {

    List<Reimbursement> findAll(String userId);

    Reimbursement saveRmb(Reimbursement rmb);

    Reimbursement findReimburesementByRmbId(Long rmbId);

    List<Reimbursement> findAllByUserTypeCode(String userTypeCode);
}
