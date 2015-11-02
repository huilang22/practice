/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a RefundReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundReasonObjectKeyData RRGetIn;
/**
 *
 * Constructor to create a  RefundReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectKeyData RRGetInIn) {
    super(id, context, "RefundReasonGet");
    RRGetIn = RRGetInIn;
  }

  public void translateToMap() {
    if (RRGetIn != null) {
      RRGetIn.resetFlags(true, true);
      addInput("RefundReason", RefundReasonObjectKeyHelper.toMap(RRGetIn, new HashMap(), "RefundReasonObjectKeyData").get("RefundReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the RefundReason
 * @param RRGetInIn Value of the RRGetIn
 *
 */

  public void setRefundReason(RefundReasonObjectKeyData RRGetInIn) {
    RRGetIn = RRGetInIn;
  }

  public void translateFromMap() {
    RRGetIn = RefundReasonObjectKeyHelper.fromMap(inputMap, "RefundReason");
  }

/**
 *
 * Gets the RefundReason
 * @return Value of the RefundReason
 *
 */

  public RefundReasonObjectKeyData getRefundReason( ) {
    return RRGetIn;
  }

}
