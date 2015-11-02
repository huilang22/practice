/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTerminateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestTerminateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestTerminateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestTerminateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestTerminateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData noOpInIn) {
    super(id, context, "BatchRequestTerminate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
/**
 *
 * Sets the  BatchRequest
 * @param noOpInIn BatchRequestObjectData to set
 *
 */
  public void setBatchRequest(BatchRequestObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequest passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectData getBatchRequest() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
  }
}
