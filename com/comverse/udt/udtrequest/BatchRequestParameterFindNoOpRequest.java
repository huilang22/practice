/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParameterFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParameterFindNoOpRequest extends BatchRequestParameterRequest {
/**
 *
 * Constructor to create a   BatchRequestParameterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParameterFindNoOpRequest(String id, BatchRequestParameterObjectDataList noOpIn) {
    super(id, "BatchRequestParameterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestParameterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestParameter", noOpIn);
      }
      addInput("BatchRequestParameter", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestParameterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParameterObjectDataList getOutput() {
    return BatchRequestParameterObjectHelper.fromMapList(outputMap, "BatchRequestParameterList");
  }
}
