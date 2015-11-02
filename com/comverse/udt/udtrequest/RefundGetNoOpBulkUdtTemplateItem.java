/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefundGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefundGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefundObjectData noOpIn;

/**
 *
 * Constructor to create a   RefundGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefundGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectData noOpInIn) {
    super(id, context, "RefundGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Refund", RefundObjectHelper.toMap(noOpIn, new HashMap(), "Refund").get("Refund"));
    }
  }
/**
 *
 * Sets the  Refund
 * @param noOpInIn RefundObjectData to set
 *
 */
  public void setRefund(RefundObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Refund passed into the constructor
 * @return Simulated response
 *
 */
  public RefundObjectData getRefund() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RefundObjectHelper.fromMap(inputMap, "Refund");
  }
}
