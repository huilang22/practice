/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a StatusReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusReasonObjectData StatusReasonCreateIn;
/**
 *
 * Constructor to create a  StatusReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectData StatusReasonCreateInIn) {
    super(id, context, "StatusReasonCreate");
    StatusReasonCreateIn = StatusReasonCreateInIn;
  }

  public void translateToMap() {
    if (StatusReasonCreateIn != null) {
      StatusReasonCreateIn.resetFlags(true, true);
      addInput("StatusReason", StatusReasonObjectHelper.toMap(StatusReasonCreateIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }


/**
 *
 * Sets the StatusReason
 * @param StatusReasonCreateInIn Value of the StatusReasonCreateIn
 *
 */

  public void setStatusReason(StatusReasonObjectData StatusReasonCreateInIn) {
    StatusReasonCreateIn = StatusReasonCreateInIn;
  }

  public void translateFromMap() {
    StatusReasonCreateIn = StatusReasonObjectHelper.fromMap(inputMap, "StatusReason");
  }

/**
 *
 * Gets the StatusReason
 * @return Value of the StatusReason
 *
 */

  public StatusReasonObjectData getStatusReason( ) {
    return StatusReasonCreateIn;
  }

}
