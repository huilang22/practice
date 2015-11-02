/*
 * Generated code DO NOT EDIT
 * Generated file: RefundGetBulkUdtTemplateItem.java
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
 * Class used to create a RefundGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundObjectKeyData refundGetIn;
/**
 *
 * Constructor to create a  RefundGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectKeyData refundGetInIn) {
    super(id, context, "RefundGet");
    refundGetIn = refundGetInIn;
  }

  public void translateToMap() {
    if (refundGetIn != null) {
      refundGetIn.resetFlags(true, true);
      addInput("Refund", RefundObjectKeyHelper.toMap(refundGetIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
  }


/**
 *
 * Sets the Refund
 * @param refundGetInIn Value of the refundGetIn
 *
 */

  public void setRefund(RefundObjectKeyData refundGetInIn) {
    refundGetIn = refundGetInIn;
  }

  public void translateFromMap() {
    refundGetIn = RefundObjectKeyHelper.fromMap(inputMap, "Refund");
  }

/**
 *
 * Gets the Refund
 * @return Value of the Refund
 *
 */

  public RefundObjectKeyData getRefund( ) {
    return refundGetIn;
  }

}
