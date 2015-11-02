/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchReportUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchReportUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectData noOpInIn) {
    super(id, context, "BatchReportUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchReport", BatchReportObjectHelper.toMap(noOpIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
/**
 *
 * Sets the  BatchReport
 * @param noOpInIn BatchReportObjectData to set
 *
 */
  public void setBatchReport(BatchReportObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReport passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportObjectData getBatchReport() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportObjectHelper.fromMap(inputMap, "BatchReport");
  }
}
