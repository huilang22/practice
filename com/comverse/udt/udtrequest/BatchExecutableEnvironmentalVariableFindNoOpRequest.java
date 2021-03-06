/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchExecutableEnvironmentalVariableFindNoOpRequest Udt Request/Response
 *
 */
public class BatchExecutableEnvironmentalVariableFindNoOpRequest extends BatchExecutableEnvironmentalVariableRequest {
/**
 *
 * Constructor to create a   BatchExecutableEnvironmentalVariableFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchExecutableEnvironmentalVariableFindNoOpRequest(String id, BatchExecutableEnvironmentalVariableObjectDataList noOpIn) {
    super(id, "BatchExecutableEnvironmentalVariableFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchExecutableEnvironmentalVariableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchExecutableEnvironmentalVariable", noOpIn);
      }
      addInput("BatchExecutableEnvironmentalVariable", mapList);
    }
  }
/**
 *
 * Retrieves the BatchExecutableEnvironmentalVariableObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableEnvironmentalVariableObjectDataList getOutput() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMapList(outputMap, "BatchExecutableEnvironmentalVariableList");
  }
}
