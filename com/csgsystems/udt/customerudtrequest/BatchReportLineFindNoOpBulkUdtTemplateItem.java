/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportLineFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchReportLineFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportLineFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportLineObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchReportLineFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportLineFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportLineObjectDataList noOpInIn) {
    super(id, context, "BatchReportLineFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = BatchReportLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchReportLine", noOpIn);
      }
      addInput("BatchReportLine", mapList);
    }
  }
/**
 *
 * Sets the  BatchReportLine
 * @param noOpInIn BatchReportLineObjectDataList to set
 *
 */
  public void setBatchReportLine(BatchReportLineObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReportLine passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportLineObjectDataList getBatchReportLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportLineObjectHelper.fromMapList(inputMap, "BatchReportLineList");
  }
}
