/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportLineDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportLineDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportLineDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportLineObjectKeyData batchReportLineDeleteIn;
/**
 *
 * Constructor to create a  BatchReportLineDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportLineDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportLineObjectKeyData batchReportLineDeleteInIn) {
    super(id, context, "BatchReportLineDelete");
    batchReportLineDeleteIn = batchReportLineDeleteInIn;
  }

  public void translateToMap() {
    if (batchReportLineDeleteIn != null) {
      batchReportLineDeleteIn.resetFlags(true, true);
      addInput("BatchReportLine", BatchReportLineObjectKeyHelper.toMap(batchReportLineDeleteIn, new HashMap(), "BatchReportLineObjectKeyData").get("BatchReportLineObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchReportLine
 * @param batchReportLineDeleteInIn Value of the batchReportLineDeleteIn
 *
 */

  public void setBatchReportLine(BatchReportLineObjectKeyData batchReportLineDeleteInIn) {
    batchReportLineDeleteIn = batchReportLineDeleteInIn;
  }

  public void translateFromMap() {
    batchReportLineDeleteIn = BatchReportLineObjectKeyHelper.fromMap(inputMap, "BatchReportLine");
  }

/**
 *
 * Gets the BatchReportLine
 * @return Value of the BatchReportLine
 *
 */

  public BatchReportLineObjectKeyData getBatchReportLine( ) {
    return batchReportLineDeleteIn;
  }

}
