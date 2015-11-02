/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a StatusReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusReasonObjectData StatusReasonUpdateIn;
/**
 *
 * Constructor to create a  StatusReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectData StatusReasonUpdateInIn) {
    super(id, context, "StatusReasonUpdate");
    StatusReasonUpdateIn = StatusReasonUpdateInIn;
  }

  public void translateToMap() {
    if (StatusReasonUpdateIn != null) {
      StatusReasonUpdateIn.resetFlags(true, true);
      addInput("StatusReason", StatusReasonObjectHelper.toMap(StatusReasonUpdateIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }


/**
 *
 * Sets the StatusReason
 * @param StatusReasonUpdateInIn Value of the StatusReasonUpdateIn
 *
 */

  public void setStatusReason(StatusReasonObjectData StatusReasonUpdateInIn) {
    StatusReasonUpdateIn = StatusReasonUpdateInIn;
  }

  public void translateFromMap() {
    StatusReasonUpdateIn = StatusReasonObjectHelper.fromMap(inputMap, "StatusReason");
  }

/**
 *
 * Gets the StatusReason
 * @return Value of the StatusReason
 *
 */

  public StatusReasonObjectData getStatusReason( ) {
    return StatusReasonUpdateIn;
  }

}
