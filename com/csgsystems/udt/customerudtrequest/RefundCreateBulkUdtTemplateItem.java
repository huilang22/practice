/*
 * Generated code DO NOT EDIT
 * Generated file: RefundCreateBulkUdtTemplateItem.java
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
 * Class used to create a RefundCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundObjectData refundCreateIn;
/**
 *
 * Constructor to create a  RefundCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectData refundCreateInIn) {
    super(id, context, "RefundCreate");
    refundCreateIn = refundCreateInIn;
  }

  public void translateToMap() {
    if (refundCreateIn != null) {
      refundCreateIn.resetFlags(true, true);
      addInput("Refund", RefundObjectHelper.toMap(refundCreateIn, new HashMap(), "Refund").get("Refund"));
    }
  }


/**
 *
 * Sets the Refund
 * @param refundCreateInIn Value of the refundCreateIn
 *
 */

  public void setRefund(RefundObjectData refundCreateInIn) {
    refundCreateIn = refundCreateInIn;
  }

  public void translateFromMap() {
    refundCreateIn = RefundObjectHelper.fromMap(inputMap, "Refund");
  }

/**
 *
 * Gets the Refund
 * @return Value of the Refund
 *
 */

  public RefundObjectData getRefund( ) {
    return refundCreateIn;
  }

}
