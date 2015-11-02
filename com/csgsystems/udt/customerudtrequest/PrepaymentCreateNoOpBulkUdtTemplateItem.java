/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PrepaymentCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PrepaymentCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PrepaymentObjectData noOpIn;

/**
 *
 * Constructor to create a   PrepaymentCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PrepaymentCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectData noOpInIn) {
    super(id, context, "PrepaymentCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Prepayment", PrepaymentObjectHelper.toMap(noOpIn, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
/**
 *
 * Sets the  Prepayment
 * @param noOpInIn PrepaymentObjectData to set
 *
 */
  public void setPrepayment(PrepaymentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Prepayment passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentObjectData getPrepayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PrepaymentObjectHelper.fromMap(inputMap, "Prepayment");
  }
}
