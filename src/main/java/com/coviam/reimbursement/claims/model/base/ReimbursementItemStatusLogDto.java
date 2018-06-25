package com.coviam.reimbursement.claims.model.base;

import com.coviam.reimbursement.claims.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Foram Shah on 23/06/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReimbursementItemStatusLogDto implements Serializable {

  private static final long serialVersionUID = -2651399533796624539L;

  private Status oldStatusCode;
  private Status newStatusCode;
  private Long reimbursementItemId;

}
