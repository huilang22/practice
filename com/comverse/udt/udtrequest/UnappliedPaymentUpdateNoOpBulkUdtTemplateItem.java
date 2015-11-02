/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentUpdateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a UnappliedPaymentUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnappliedPaymentUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnappliedPaymentObjectData noOpIn;

/**
 *
 * Constructor to create a   UnappliedPaymentUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnappliedPaymentUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnappliedPaymentObjectData noOpInIn) {
    super(id, context, "UnappliedPaymentUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(noOpIn, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }
/**
 *
 * Sets the  UnappliedPayment
 * @param noOpInIn UnappliedPaymentObjectData to set
 *
 */
  public void setUnappliedPayment(UnappliedPaymentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnappliedPayment passed into the constructor
 * @return Simulated response
 *
 */
  public UnappliedPaymentObjectData getUnappliedPayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnappliedPaymentObjectHelper.fromMap(inputMap, "UnappliedPayment");
  }
}
