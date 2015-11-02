/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestNotifyParameterGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestNotifyParameterGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestNotifyParameterObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestNotifyParameterGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestNotifyParameterGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectData noOpInIn) {
    super(id, context, "BatchRequestNotifyParameterGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
/**
 *
 * Sets the  BatchRequestNotifyParameter
 * @param noOpInIn BatchRequestNotifyParameterObjectData to set
 *
 */
  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestNotifyParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestNotifyParameterObjectHelper.fromMap(inputMap, "BatchRequestNotifyParameter");
  }
}
