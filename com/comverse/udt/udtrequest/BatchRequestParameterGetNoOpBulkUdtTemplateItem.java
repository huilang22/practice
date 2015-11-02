/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParameterGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParameterGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParameterObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParameterGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParameterGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectData noOpInIn) {
    super(id, context, "BatchRequestParameterGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParameter", BatchRequestParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
/**
 *
 * Sets the  BatchRequestParameter
 * @param noOpInIn BatchRequestParameterObjectData to set
 *
 */
  public void setBatchRequestParameter(BatchRequestParameterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParameterObjectData getBatchRequestParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParameterObjectHelper.fromMap(inputMap, "BatchRequestParameter");
  }
}
