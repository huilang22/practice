/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData noOpInIn) {
    super(id, context, "BatchRequestSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
/**
 *
 * Sets the  BatchRequest
 * @param noOpInIn BatchRequestObjectKeyData to set
 *
 */
  public void setBatchRequest(BatchRequestObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequest passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectKeyData getBatchRequest() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
  }
}
