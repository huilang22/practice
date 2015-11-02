/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportObjectKeyData batchReportGetIn;
/**
 *
 * Constructor to create a  BatchReportGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectKeyData batchReportGetInIn) {
    super(id, context, "BatchReportGet");
    batchReportGetIn = batchReportGetInIn;
  }

  public void translateToMap() {
    if (batchReportGetIn != null) {
      batchReportGetIn.resetFlags(true, true);
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(batchReportGetIn, new HashMap(), "BatchReportObjectKeyData").get("BatchReportObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchReport
 * @param batchReportGetInIn Value of the batchReportGetIn
 *
 */

  public void setBatchReport(BatchReportObjectKeyData batchReportGetInIn) {
    batchReportGetIn = batchReportGetInIn;
  }

  public void translateFromMap() {
    batchReportGetIn = BatchReportObjectKeyHelper.fromMap(inputMap, "BatchReport");
  }

/**
 *
 * Gets the BatchReport
 * @return Value of the BatchReport
 *
 */

  public BatchReportObjectKeyData getBatchReport( ) {
    return batchReportGetIn;
  }

}
