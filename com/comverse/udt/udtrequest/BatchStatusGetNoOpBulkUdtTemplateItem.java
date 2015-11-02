/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchStatusObjectData noOpInIn) {
    super(id, context, "BatchStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchStatus", BatchStatusObjectHelper.toMap(noOpIn, new HashMap(), "BatchStatus").get("BatchStatus"));
    }
  }
/**
 *
 * Sets the  BatchStatus
 * @param noOpInIn BatchStatusObjectData to set
 *
 */
  public void setBatchStatus(BatchStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchStatus passed into the constructor
 * @return Simulated response
 *
 */
  public BatchStatusObjectData getBatchStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchStatusObjectHelper.fromMap(inputMap, "BatchStatus");
  }
}
