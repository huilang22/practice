/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a StatusReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusReasonObjectKeyData StatusReasonGetIn;
/**
 *
 * Constructor to create a  StatusReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectKeyData StatusReasonGetInIn) {
    super(id, context, "StatusReasonGet");
    StatusReasonGetIn = StatusReasonGetInIn;
  }

  public void translateToMap() {
    if (StatusReasonGetIn != null) {
      StatusReasonGetIn.resetFlags(true, true);
      addInput("StatusReason", StatusReasonObjectKeyHelper.toMap(StatusReasonGetIn, new HashMap(), "StatusReasonObjectKeyData").get("StatusReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the StatusReason
 * @param StatusReasonGetInIn Value of the StatusReasonGetIn
 *
 */

  public void setStatusReason(StatusReasonObjectKeyData StatusReasonGetInIn) {
    StatusReasonGetIn = StatusReasonGetInIn;
  }

  public void translateFromMap() {
    StatusReasonGetIn = StatusReasonObjectKeyHelper.fromMap(inputMap, "StatusReason");
  }

/**
 *
 * Gets the StatusReason
 * @return Value of the StatusReason
 *
 */

  public StatusReasonObjectKeyData getStatusReason( ) {
    return StatusReasonGetIn;
  }

}
