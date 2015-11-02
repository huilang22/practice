/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportObjectData batchReportCreateIn;
/**
 *
 * Constructor to create a  BatchReportCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectData batchReportCreateInIn) {
    super(id, context, "BatchReportCreate");
    batchReportCreateIn = batchReportCreateInIn;
  }

  public void translateToMap() {
    if (batchReportCreateIn != null) {
      batchReportCreateIn.resetFlags(true, true);
      addInput("BatchReport", BatchReportObjectHelper.toMap(batchReportCreateIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }


/**
 *
 * Sets the BatchReport
 * @param batchReportCreateInIn Value of the batchReportCreateIn
 *
 */

  public void setBatchReport(BatchReportObjectData batchReportCreateInIn) {
    batchReportCreateIn = batchReportCreateInIn;
  }

  public void translateFromMap() {
    batchReportCreateIn = BatchReportObjectHelper.fromMap(inputMap, "BatchReport");
  }

/**
 *
 * Gets the BatchReport
 * @return Value of the BatchReport
 *
 */

  public BatchReportObjectData getBatchReport( ) {
    return batchReportCreateIn;
  }

}
