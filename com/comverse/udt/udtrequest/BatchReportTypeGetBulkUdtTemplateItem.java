/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchReportTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchReportTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchReportTypeObjectKeyData batchReportTypeGetIn;
/**
 *
 * Constructor to create a  BatchReportTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchReportTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportTypeObjectKeyData batchReportTypeGetInIn) {
    super(id, context, "BatchReportTypeGet");
    batchReportTypeGetIn = batchReportTypeGetInIn;
  }

  public void translateToMap() {
    if (batchReportTypeGetIn != null) {
      batchReportTypeGetIn.resetFlags(true, true);
      addInput("BatchReportType", BatchReportTypeObjectKeyHelper.toMap(batchReportTypeGetIn, new HashMap(), "BatchReportTypeObjectKeyData").get("BatchReportTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchReportType
 * @param batchReportTypeGetInIn Value of the batchReportTypeGetIn
 *
 */

  public void setBatchReportType(BatchReportTypeObjectKeyData batchReportTypeGetInIn) {
    batchReportTypeGetIn = batchReportTypeGetInIn;
  }

  public void translateFromMap() {
    batchReportTypeGetIn = BatchReportTypeObjectKeyHelper.fromMap(inputMap, "BatchReportType");
  }

/**
 *
 * Gets the BatchReportType
 * @return Value of the BatchReportType
 *
 */

  public BatchReportTypeObjectKeyData getBatchReportType( ) {
    return batchReportTypeGetIn;
  }

}
