/*
 * Generated code DO NOT EDIT
 * Generated file: RefundFindBulkUdtTemplateItem.java
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
 * Class used to create a RefundFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundObjectFilter refundFindIn;
/**
 *
 * Constructor to create a  RefundFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectFilter refundFindInIn) {
    super(id, context, "RefundFind");
    refundFindIn = refundFindInIn;
  }

  public void translateToMap() {
    if (refundFindIn != null) {
      Integer index =  refundFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Refund", RefundObjectHelper.toMap(refundFindIn, new HashMap(), "Refund").get("Refund"));
    }
  }


/**
 *
 * Sets the Refund
 * @param refundFindInIn Value of the refundFindIn
 *
 */

  public void setRefund(RefundObjectFilter refundFindInIn) {
    refundFindIn = refundFindInIn;
  }

  public void translateFromMap() {
    refundFindIn = RefundObjectHelper.fromMapFilter(inputMap, "Refund");
  }

/**
 *
 * Gets the Refund
 * @return Value of the Refund
 *
 */

  public RefundObjectFilter getRefund( ) {
    return refundFindIn;
  }

}
