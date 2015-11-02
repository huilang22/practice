/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectData noOpInIn) {
    super(id, context, "StatusTypeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("StatusType", StatusTypeObjectHelper.toMap(noOpIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }
/**
 *
 * Sets the  StatusType
 * @param noOpInIn StatusTypeObjectData to set
 *
 */
  public void setStatusType(StatusTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusType passed into the constructor
 * @return Simulated response
 *
 */
  public StatusTypeObjectData getStatusType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusTypeObjectHelper.fromMap(inputMap, "StatusType");
  }
}
