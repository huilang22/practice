/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportLineCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportLineCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportLineObjectData batchReportLineCreateIn;
/**
 *
 * Constructor to create a  BatchReportLineCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportLineCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportLineObjectData batchReportLineCreateInIn) {
    super(id, context, "BatchReportLineCreate");
    batchReportLineCreateIn = batchReportLineCreateInIn;
  }

  public void translateToMap() {
    if (batchReportLineCreateIn != null) {
      batchReportLineCreateIn.resetFlags(true, true);
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(batchReportLineCreateIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }


/**
 *
 * Sets the BatchReportLine
 * @param batchReportLineCreateInIn Value of the batchReportLineCreateIn
 *
 */

  public void setBatchReportLine(BatchReportLineObjectData batchReportLineCreateInIn) {
    batchReportLineCreateIn = batchReportLineCreateInIn;
  }

  public void translateFromMap() {
    batchReportLineCreateIn = BatchReportLineObjectHelper.fromMap(inputMap, "BatchReportLine");
  }

/**
 *
 * Gets the BatchReportLine
 * @return Value of the BatchReportLine
 *
 */

  public BatchReportLineObjectData getBatchReportLine( ) {
    return batchReportLineCreateIn;
  }

}
