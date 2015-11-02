/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusReasonDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusReasonDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusReasonDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusReasonDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectData noOpInIn) {
    super(id, context, "StatusReasonDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("StatusReason", StatusReasonObjectHelper.toMap(noOpIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
/**
 *
 * Sets the  StatusReason
 * @param noOpInIn StatusReasonObjectData to set
 *
 */
  public void setStatusReason(StatusReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusReason passed into the constructor
 * @return Simulated response
 *
 */
  public StatusReasonObjectData getStatusReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusReasonObjectHelper.fromMap(inputMap, "StatusReason");
  }
}
