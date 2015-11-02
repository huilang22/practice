/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchReportTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchReportTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchReportTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchReportTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchReportTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchReportTypeObjectDataList noOpInIn) {
    super(id, context, "BatchReportTypeFind");
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
        mapArray[i] = BatchReportTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchReportType", noOpIn);
      }
      addInput("BatchReportType", mapList);
    }
  }
/**
 *
 * Sets the  BatchReportType
 * @param noOpInIn BatchReportTypeObjectDataList to set
 *
 */
  public void setBatchReportType(BatchReportTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchReportType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportTypeObjectDataList getBatchReportType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchReportTypeObjectHelper.fromMapList(inputMap, "BatchReportTypeList");
  }
}
