/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineFindNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchReportLineFindNoOpRequest Udt Request/Response
 *
 */
public class BatchReportLineFindNoOpRequest extends BatchReportLineRequest {
/**
 *
 * Constructor to create a   BatchReportLineFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchReportLineFindNoOpRequest(String id, BatchReportLineObjectDataList noOpIn) {
    super(id, "BatchReportLineFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchReportLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchReportLine", noOpIn);
      }
      addInput("BatchReportLine", mapList);
    }
  }
/**
 *
 * Retrieves the BatchReportLineObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportLineObjectDataList getOutput() {
    return BatchReportLineObjectHelper.fromMapList(outputMap, "BatchReportLineList");
  }
}
