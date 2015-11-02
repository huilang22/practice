/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchReportDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchReportDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectData noOpInIn) {
    super(id, context, "BatchReportDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchReport", BatchReportObjectHelper.toMap(noOpIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
/**
 *
 * Sets the  BatchReport
 * @param noOpInIn BatchReportObjectData to set
 *
 */
  public void setBatchReport(BatchReportObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReport passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportObjectData getBatchReport() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportObjectHelper.fromMap(inputMap, "BatchReport");
  }
}
