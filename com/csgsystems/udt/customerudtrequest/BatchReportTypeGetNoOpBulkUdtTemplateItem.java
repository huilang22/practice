/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchReportTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchReportTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportTypeObjectData noOpInIn) {
    super(id, context, "BatchReportTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchReportType", BatchReportTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchReportType").get("BatchReportType"));
    }
  }
/**
 *
 * Sets the  BatchReportType
 * @param noOpInIn BatchReportTypeObjectData to set
 *
 */
  public void setBatchReportType(BatchReportTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReportType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportTypeObjectData getBatchReportType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportTypeObjectHelper.fromMap(inputMap, "BatchReportType");
  }
}
