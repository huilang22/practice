/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a StatusReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusReasonObjectKeyData StatusReasonDeleteIn;
/**
 *
 * Constructor to create a  StatusReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectKeyData StatusReasonDeleteInIn) {
    super(id, context, "StatusReasonDelete");
    StatusReasonDeleteIn = StatusReasonDeleteInIn;
  }

  public void translateToMap() {
    if (StatusReasonDeleteIn != null) {
      StatusReasonDeleteIn.resetFlags(true, true);
      addInput("StatusReason", StatusReasonObjectKeyHelper.toMap(StatusReasonDeleteIn, new HashMap(), "StatusReasonObjectKeyData").get("StatusReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the StatusReason
 * @param StatusReasonDeleteInIn Value of the StatusReasonDeleteIn
 *
 */

  public void setStatusReason(StatusReasonObjectKeyData StatusReasonDeleteInIn) {
    StatusReasonDeleteIn = StatusReasonDeleteInIn;
  }

  public void translateFromMap() {
    StatusReasonDeleteIn = StatusReasonObjectKeyHelper.fromMap(inputMap, "StatusReason");
  }

/**
 *
 * Gets the StatusReason
 * @return Value of the StatusReason
 *
 */

  public StatusReasonObjectKeyData getStatusReason( ) {
    return StatusReasonDeleteIn;
  }

}
