/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTypeStageGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeStageGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeStageObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchTypeStageGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeStageGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeStageObjectData noOpInIn) {
    super(id, context, "BatchTypeStageGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(noOpIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
/**
 *
 * Sets the  BatchTypeStage
 * @param noOpInIn BatchTypeStageObjectData to set
 *
 */
  public void setBatchTypeStage(BatchTypeStageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchTypeStage passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeStageObjectData getBatchTypeStage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeStageObjectHelper.fromMap(inputMap, "BatchTypeStage");
  }
}
