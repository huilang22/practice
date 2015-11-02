/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskTypeFindNoOpRequest Udt Request/Response
 *
 */
public class CitTaskTypeFindNoOpRequest extends CitTaskTypeRequest {
/**
 *
 * Constructor to create a   CitTaskTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskTypeFindNoOpRequest(String id, CitTaskTypeObjectDataList noOpIn) {
    super(id, "CitTaskTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitTaskTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitTaskType", noOpIn);
      }
      addInput("CitTaskType", mapList);
    }
  }
/**
 *
 * Retrieves the CitTaskTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskTypeObjectDataList getOutput() {
    return CitTaskTypeObjectHelper.fromMapList(outputMap, "CitTaskTypeList");
  }
}
