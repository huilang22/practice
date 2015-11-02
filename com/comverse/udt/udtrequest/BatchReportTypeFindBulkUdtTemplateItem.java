/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportTypeObjectFilter batchReportTypeFindIn;
/**
 *
 * Constructor to create a  BatchReportTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportTypeObjectFilter batchReportTypeFindInIn) {
    super(id, context, "BatchReportTypeFind");
    batchReportTypeFindIn = batchReportTypeFindInIn;
  }

  public void translateToMap() {
    if (batchReportTypeFindIn != null) {
      Integer index =  batchReportTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchReportType", BatchReportTypeObjectHelper.toMap(batchReportTypeFindIn, new HashMap(), "BatchReportType").get("BatchReportType"));
    }
  }


/**
 *
 * Sets the BatchReportType
 * @param batchReportTypeFindInIn Value of the batchReportTypeFindIn
 *
 */

  public void setBatchReportType(BatchReportTypeObjectFilter batchReportTypeFindInIn) {
    batchReportTypeFindIn = batchReportTypeFindInIn;
  }

  public void translateFromMap() {
    batchReportTypeFindIn = BatchReportTypeObjectHelper.fromMapFilter(inputMap, "BatchReportType");
  }

/**
 *
 * Gets the BatchReportType
 * @return Value of the BatchReportType
 *
 */

  public BatchReportTypeObjectFilter getBatchReportType( ) {
    return batchReportTypeFindIn;
  }

}
