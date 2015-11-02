/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchReportFindNoOpRequest Udt Request/Response
 *
 */
public class BatchReportFindNoOpRequest extends BatchReportRequest {
/**
 *
 * Constructor to create a   BatchReportFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchReportFindNoOpRequest(String id, BatchReportObjectDataList noOpIn) {
    super(id, "BatchReportFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchReportObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchReport", noOpIn);
      }
      addInput("BatchReport", mapList);
    }
  }
/**
 *
 * Retrieves the BatchReportObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportObjectDataList getOutput() {
    return BatchReportObjectHelper.fromMapList(outputMap, "BatchReportList");
  }
}
