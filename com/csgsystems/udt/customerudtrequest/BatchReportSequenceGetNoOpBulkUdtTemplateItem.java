/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportSequenceGetNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a BatchReportSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchReportSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectKeyData noOpInIn) {
    super(id, context, "BatchReportSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
/**
 *
 * Sets the  BatchReport
 * @param noOpInIn BatchReportObjectKeyData to set
 *
 */
  public void setBatchReport(BatchReportObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReport passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportObjectKeyData getBatchReport() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportObjectKeyHelper.fromMap(inputMap, "BatchReport");
  }
}
