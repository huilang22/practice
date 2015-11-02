/*
 * Generated code DO NOT EDIT
 * Generated file: AsyncRequestCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a AsyncRequestCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AsyncRequestCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BigInteger noOpIn;

/**
 *
 * Constructor to create a   AsyncRequestCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AsyncRequestCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger noOpInIn) {
    super(id, context, "AsyncRequestCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("BatchId", noOpIn);
    }
  }
/**
 *
 * Sets the  BatchId
 * @param noOpInIn BigInteger to set
 *
 */
  public void setBatchId(BigInteger noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchId passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getBatchId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BigInteger)inputMap.get("BatchId");
  }
}
