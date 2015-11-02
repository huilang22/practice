/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceFindNoOpRequest.java
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
 * NoOp class used to simulate a CitImportanceFindNoOpRequest Udt Request/Response
 *
 */
public class CitImportanceFindNoOpRequest extends CitImportanceRequest {
/**
 *
 * Constructor to create a   CitImportanceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitImportanceFindNoOpRequest(String id, CitImportanceObjectDataList noOpIn) {
    super(id, "CitImportanceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitImportanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitImportance", noOpIn);
      }
      addInput("CitImportance", mapList);
    }
  }
/**
 *
 * Retrieves the CitImportanceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitImportanceObjectDataList getOutput() {
    return CitImportanceObjectHelper.fromMapList(outputMap, "CitImportanceList");
  }
}
