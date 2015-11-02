/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchReportFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchReportFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportObjectDataList noOpInIn) {
    super(id, context, "BatchReportFind");
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
        mapArray[i] = BatchReportObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchReport", noOpIn);
      }
      addInput("BatchReport", mapList);
    }
  }
/**
 *
 * Sets the  BatchReport
 * @param noOpInIn BatchReportObjectDataList to set
 *
 */
  public void setBatchReport(BatchReportObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReport passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportObjectDataList getBatchReport() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportObjectHelper.fromMapList(inputMap, "BatchReportList");
  }
}
