/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportLineFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportLineFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportLineObjectFilter batchReportLineFindIn;
/**
 *
 * Constructor to create a  BatchReportLineFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportLineFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportLineObjectFilter batchReportLineFindInIn) {
    super(id, context, "BatchReportLineFind");
    batchReportLineFindIn = batchReportLineFindInIn;
  }

  public void translateToMap() {
    if (batchReportLineFindIn != null) {
      Integer index =  batchReportLineFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(batchReportLineFindIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }


/**
 *
 * Sets the BatchReportLine
 * @param batchReportLineFindInIn Value of the batchReportLineFindIn
 *
 */

  public void setBatchReportLine(BatchReportLineObjectFilter batchReportLineFindInIn) {
    batchReportLineFindIn = batchReportLineFindInIn;
  }

  public void translateFromMap() {
    batchReportLineFindIn = BatchReportLineObjectHelper.fromMapFilter(inputMap, "BatchReportLine");
  }

/**
 *
 * Gets the BatchReportLine
 * @return Value of the BatchReportLine
 *
 */

  public BatchReportLineObjectFilter getBatchReportLine( ) {
    return batchReportLineFindIn;
  }

}
