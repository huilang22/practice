/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionUdtGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionUdtGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestTemplateDefinitionUdtGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BulkUdtTemplateRootRequest noOpIn;

/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionUdtGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionUdtGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkUdtTemplateRootRequest noOpInIn) {
    super(id, context, "BatchRequestTemplateDefinitionUdtGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData", noOpIn);
    }
  }
/**
 *
 * Sets the  BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData
 * @param noOpInIn BulkUdtTemplateRootRequest to set
 *
 */
  public void setBatchRequestTemplateDefinitionUdtGetOutUdtTemplateData(BulkUdtTemplateRootRequest noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData passed into the constructor
 * @return Simulated response
 *
 */
  public BulkUdtTemplateRootRequest getBatchRequestTemplateDefinitionUdtGetOutUdtTemplateData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BulkUdtTemplateRootRequest)inputMap.get("BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData");
  }
}
