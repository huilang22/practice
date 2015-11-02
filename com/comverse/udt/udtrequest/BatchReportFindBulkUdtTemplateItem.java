/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportObjectFilter batchReportFindIn;
/**
 *
 * Constructor to create a  BatchReportFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectFilter batchReportFindInIn) {
    super(id, context, "BatchReportFind");
    batchReportFindIn = batchReportFindInIn;
  }

  public void translateToMap() {
    if (batchReportFindIn != null) {
      Integer index =  batchReportFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchReport", BatchReportObjectHelper.toMap(batchReportFindIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }


/**
 *
 * Sets the BatchReport
 * @param batchReportFindInIn Value of the batchReportFindIn
 *
 */

  public void setBatchReport(BatchReportObjectFilter batchReportFindInIn) {
    batchReportFindIn = batchReportFindInIn;
  }

  public void translateFromMap() {
    batchReportFindIn = BatchReportObjectHelper.fromMapFilter(inputMap, "BatchReport");
  }

/**
 *
 * Gets the BatchReport
 * @return Value of the BatchReport
 *
 */

  public BatchReportObjectFilter getBatchReport( ) {
    return batchReportFindIn;
  }

}
