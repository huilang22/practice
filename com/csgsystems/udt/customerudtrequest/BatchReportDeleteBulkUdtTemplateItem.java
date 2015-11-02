/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportObjectKeyData batchReportDeleteIn;
/**
 *
 * Constructor to create a  BatchReportDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectKeyData batchReportDeleteInIn) {
    super(id, context, "BatchReportDelete");
    batchReportDeleteIn = batchReportDeleteInIn;
  }

  public void translateToMap() {
    if (batchReportDeleteIn != null) {
      batchReportDeleteIn.resetFlags(true, true);
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(batchReportDeleteIn, new HashMap(), "BatchReportObjectKeyData").get("BatchReportObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchReport
 * @param batchReportDeleteInIn Value of the batchReportDeleteIn
 *
 */

  public void setBatchReport(BatchReportObjectKeyData batchReportDeleteInIn) {
    batchReportDeleteIn = batchReportDeleteInIn;
  }

  public void translateFromMap() {
    batchReportDeleteIn = BatchReportObjectKeyHelper.fromMap(inputMap, "BatchReport");
  }

/**
 *
 * Gets the BatchReport
 * @return Value of the BatchReport
 *
 */

  public BatchReportObjectKeyData getBatchReport( ) {
    return batchReportDeleteIn;
  }

}
