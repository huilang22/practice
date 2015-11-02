/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeParameterFindNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeParameterFindNoOpRequest extends BatchTypeParameterRequest {
/**
 *
 * Constructor to create a   BatchTypeParameterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeParameterFindNoOpRequest(String id, BatchTypeParameterObjectDataList noOpIn) {
    super(id, "BatchTypeParameterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchTypeParameterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchTypeParameter", noOpIn);
      }
      addInput("BatchTypeParameter", mapList);
    }
  }
/**
 *
 * Retrieves the BatchTypeParameterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeParameterObjectDataList getOutput() {
    return BatchTypeParameterObjectHelper.fromMapList(outputMap, "BatchTypeParameterList");
  }
}
