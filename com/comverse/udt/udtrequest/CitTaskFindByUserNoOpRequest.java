/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskFindByUserNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitTaskFindByUserNoOpRequest Udt Request/Response
 *
 */
public class CitTaskFindByUserNoOpRequest extends CitTaskRequest {
/**
 *
 * Constructor to create a   CitTaskFindByUserNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskFindByUserNoOpRequest(String id, CitTaskObjectDataList noOpIn) {
    super(id, "CitTaskFindByUserNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitTaskObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitTask", noOpIn);
      }
      addInput("CitTask", mapList);
    }
  }
/**
 *
 * Retrieves the CitTaskObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectDataList getOutput() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
}
