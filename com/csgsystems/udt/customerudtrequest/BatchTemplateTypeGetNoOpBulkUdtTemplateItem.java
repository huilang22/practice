/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTemplateTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTemplateTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTemplateTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTemplateTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchTemplateTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTemplateTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTemplateTypeObjectData noOpInIn) {
    super(id, context, "BatchTemplateTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchTemplateType", BatchTemplateTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchTemplateType").get("BatchTemplateType"));
    }
  }
/**
 *
 * Sets the  BatchTemplateType
 * @param noOpInIn BatchTemplateTypeObjectData to set
 *
 */
  public void setBatchTemplateType(BatchTemplateTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchTemplateType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTemplateTypeObjectData getBatchTemplateType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTemplateTypeObjectHelper.fromMap(inputMap, "BatchTemplateType");
  }
}
