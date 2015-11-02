/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RefundUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundObjectData refundUpdateIn;
/**
 *
 * Constructor to create a  RefundUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectData refundUpdateInIn) {
    super(id, context, "RefundUpdate");
    refundUpdateIn = refundUpdateInIn;
  }

  public void translateToMap() {
    if (refundUpdateIn != null) {
      refundUpdateIn.resetFlags(true, true);
      addInput("Refund", RefundObjectHelper.toMap(refundUpdateIn, new HashMap(), "Refund").get("Refund"));
    }
  }


/**
 *
 * Sets the Refund
 * @param refundUpdateInIn Value of the refundUpdateIn
 *
 */

  public void setRefund(RefundObjectData refundUpdateInIn) {
    refundUpdateIn = refundUpdateInIn;
  }

  public void translateFromMap() {
    refundUpdateIn = RefundObjectHelper.fromMap(inputMap, "Refund");
  }

/**
 *
 * Gets the Refund
 * @return Value of the Refund
 *
 */

  public RefundObjectData getRefund( ) {
    return refundUpdateIn;
  }

}
