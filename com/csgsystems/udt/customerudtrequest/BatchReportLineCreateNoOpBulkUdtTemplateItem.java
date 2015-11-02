/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportLineCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchReportLineCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportLineCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportLineObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchReportLineCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportLineCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportLineObjectData noOpInIn) {
    super(id, context, "BatchReportLineCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(noOpIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }
/**
 *
 * Sets the  BatchReportLine
 * @param noOpInIn BatchReportLineObjectData to set
 *
 */
  public void setBatchReportLine(BatchReportLineObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReportLine passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportLineObjectData getBatchReportLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportLineObjectHelper.fromMap(inputMap, "BatchReportLine");
  }
}
