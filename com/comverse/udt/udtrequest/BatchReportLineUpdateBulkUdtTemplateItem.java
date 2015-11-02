/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportLineUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportLineUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportLineObjectData batchReportLineUpdateIn;
/**
 *
 * Constructor to create a  BatchReportLineUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportLineUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportLineObjectData batchReportLineUpdateInIn) {
    super(id, context, "BatchReportLineUpdate");
    batchReportLineUpdateIn = batchReportLineUpdateInIn;
  }

  public void translateToMap() {
    if (batchReportLineUpdateIn != null) {
      batchReportLineUpdateIn.resetFlags(true, true);
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(batchReportLineUpdateIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }


/**
 *
 * Sets the BatchReportLine
 * @param batchReportLineUpdateInIn Value of the batchReportLineUpdateIn
 *
 */

  public void setBatchReportLine(BatchReportLineObjectData batchReportLineUpdateInIn) {
    batchReportLineUpdateIn = batchReportLineUpdateInIn;
  }

  public void translateFromMap() {
    batchReportLineUpdateIn = BatchReportLineObjectHelper.fromMap(inputMap, "BatchReportLine");
  }

/**
 *
 * Gets the BatchReportLine
 * @return Value of the BatchReportLine
 *
 */

  public BatchReportLineObjectData getBatchReportLine( ) {
    return batchReportLineUpdateIn;
  }

}
