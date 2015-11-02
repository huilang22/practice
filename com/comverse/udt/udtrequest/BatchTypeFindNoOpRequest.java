/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeFindNoOpRequest extends BatchTypeRequest {
/**
 *
 * Constructor to create a   BatchTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeFindNoOpRequest(String id, BatchTypeObjectDataList noOpIn) {
    super(id, "BatchTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchType", noOpIn);
      }
      addInput("BatchType", mapList);
    }
  }
/**
 *
 * Retrieves the BatchTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeObjectDataList getOutput() {
    return BatchTypeObjectHelper.fromMapList(outputMap, "BatchTypeList");
  }
}
