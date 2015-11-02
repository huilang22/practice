/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportUpdateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BatchReportUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportObjectData batchReportUpdateIn;
/**
 *
 * Constructor to create a  BatchReportUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectData batchReportUpdateInIn) {
    super(id, context, "BatchReportUpdate");
    batchReportUpdateIn = batchReportUpdateInIn;
  }

  public void translateToMap() {
    if (batchReportUpdateIn != null) {
      batchReportUpdateIn.resetFlags(true, true);
      addInput("BatchReport", BatchReportObjectHelper.toMap(batchReportUpdateIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }


/**
 *
 * Sets the BatchReport
 * @param batchReportUpdateInIn Value of the batchReportUpdateIn
 *
 */

  public void setBatchReport(BatchReportObjectData batchReportUpdateInIn) {
    batchReportUpdateIn = batchReportUpdateInIn;
  }

  public void translateFromMap() {
    batchReportUpdateIn = BatchReportObjectHelper.fromMap(inputMap, "BatchReport");
  }

/**
 *
 * Gets the BatchReport
 * @return Value of the BatchReport
 *
 */

  public BatchReportObjectData getBatchReport( ) {
    return batchReportUpdateIn;
  }

}
