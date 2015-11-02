/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionUpdateUnredeemedNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AccountBonusPointTransactionUpdateUnredeemedNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBonusPointTransactionUpdateUnredeemedNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   AccountBonusPointTransactionUpdateUnredeemedNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBonusPointTransactionUpdateUnredeemedNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "AccountBonusPointTransactionUpdateUnredeemed");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("ABPUpdateUnredeemedCountOut", noOpIn);
    }
  }
/**
 *
 * Sets the  ABPUpdateUnredeemedCountOut
 * @param noOpInIn Integer to set
 *
 */
  public void setABPUpdateUnredeemedCountOut(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ABPUpdateUnredeemedCountOut passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getABPUpdateUnredeemedCountOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("ABPUpdateUnredeemedCountOut");
  }
}
