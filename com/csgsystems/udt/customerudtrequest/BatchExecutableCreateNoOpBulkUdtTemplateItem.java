/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchExecutableCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchExecutableCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchExecutableObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchExecutableCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchExecutableCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectData noOpInIn) {
    super(id, context, "BatchExecutableCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(noOpIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
/**
 *
 * Sets the  BatchExecutable
 * @param noOpInIn BatchExecutableObjectData to set
 *
 */
  public void setBatchExecutable(BatchExecutableObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchExecutable passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableObjectData getBatchExecutable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchExecutableObjectHelper.fromMap(inputMap, "BatchExecutable");
  }
}
