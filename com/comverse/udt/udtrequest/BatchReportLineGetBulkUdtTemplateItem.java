/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportLineGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportLineGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportLineObjectKeyData batchReportLineGetIn;
/**
 *
 * Constructor to create a  BatchReportLineGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportLineGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportLineObjectKeyData batchReportLineGetInIn) {
    super(id, context, "BatchReportLineGet");
    batchReportLineGetIn = batchReportLineGetInIn;
  }

  public void translateToMap() {
    if (batchReportLineGetIn != null) {
      batchReportLineGetIn.resetFlags(true, true);
      addInput("BatchReportLine", BatchReportLineObjectKeyHelper.toMap(batchReportLineGetIn, new HashMap(), "BatchReportLineObjectKeyData").get("BatchReportLineObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchReportLine
 * @param batchReportLineGetInIn Value of the batchReportLineGetIn
 *
 */

  public void setBatchReportLine(BatchReportLineObjectKeyData batchReportLineGetInIn) {
    batchReportLineGetIn = batchReportLineGetInIn;
  }

  public void translateFromMap() {
    batchReportLineGetIn = BatchReportLineObjectKeyHelper.fromMap(inputMap, "BatchReportLine");
  }

/**
 *
 * Gets the BatchReportLine
 * @return Value of the BatchReportLine
 *
 */

  public BatchReportLineObjectKeyData getBatchReportLine( ) {
    return batchReportLineGetIn;
  }

}
