/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionHoldNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EftTransactionHoldNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EftTransactionHoldNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EftTransactionObjectData noOpIn;

/**
 *
 * Constructor to create a   EftTransactionHoldNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EftTransactionHoldNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectData noOpInIn) {
    super(id, context, "EftTransactionHold");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(noOpIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
/**
 *
 * Sets the  EftTransaction
 * @param noOpInIn EftTransactionObjectData to set
 *
 */
  public void setEftTransaction(EftTransactionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EftTransaction passed into the constructor
 * @return Simulated response
 *
 */
  public EftTransactionObjectData getEftTransaction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EftTransactionObjectHelper.fromMap(inputMap, "EftTransaction");
  }
}
