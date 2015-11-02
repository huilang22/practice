/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchExecutableFindNoOpRequest Udt Request/Response
 *
 */
public class BatchExecutableFindNoOpRequest extends BatchExecutableRequest {
/**
 *
 * Constructor to create a   BatchExecutableFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchExecutableFindNoOpRequest(String id, BatchExecutableObjectDataList noOpIn) {
    super(id, "BatchExecutableFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchExecutableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchExecutable", noOpIn);
      }
      addInput("BatchExecutable", mapList);
    }
  }
/**
 *
 * Retrieves the BatchExecutableObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableObjectDataList getOutput() {
    return BatchExecutableObjectHelper.fromMapList(outputMap, "BatchExecutableList");
  }
}
