/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RefundReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundReasonObjectKeyData RRDeleteIn;
/**
 *
 * Constructor to create a  RefundReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectKeyData RRDeleteInIn) {
    super(id, context, "RefundReasonDelete");
    RRDeleteIn = RRDeleteInIn;
  }

  public void translateToMap() {
    if (RRDeleteIn != null) {
      RRDeleteIn.resetFlags(true, true);
      addInput("RefundReason", RefundReasonObjectKeyHelper.toMap(RRDeleteIn, new HashMap(), "RefundReasonObjectKeyData").get("RefundReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the RefundReason
 * @param RRDeleteInIn Value of the RRDeleteIn
 *
 */

  public void setRefundReason(RefundReasonObjectKeyData RRDeleteInIn) {
    RRDeleteIn = RRDeleteInIn;
  }

  public void translateFromMap() {
    RRDeleteIn = RefundReasonObjectKeyHelper.fromMap(inputMap, "RefundReason");
  }

/**
 *
 * Gets the RefundReason
 * @return Value of the RefundReason
 *
 */

  public RefundReasonObjectKeyData getRefundReason( ) {
    return RRDeleteIn;
  }

}
