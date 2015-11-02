/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchReportTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BatchReportTypeFindNoOpRequest extends BatchReportTypeRequest {
/**
 *
 * Constructor to create a   BatchReportTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchReportTypeFindNoOpRequest(String id, BatchReportTypeObjectDataList noOpIn) {
    super(id, "BatchReportTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchReportTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchReportType", noOpIn);
      }
      addInput("BatchReportType", mapList);
    }
  }
/**
 *
 * Retrieves the BatchReportTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportTypeObjectDataList getOutput() {
    return BatchReportTypeObjectHelper.fromMapList(outputMap, "BatchReportTypeList");
  }
}
