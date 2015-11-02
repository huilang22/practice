/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RbrDecisionTreeFindNoOpRequest Udt Request/Response
 *
 */
public class RbrDecisionTreeFindNoOpRequest extends RbrDecisionTreeRequest {
/**
 *
 * Constructor to create a   RbrDecisionTreeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrDecisionTreeFindNoOpRequest(String id, RbrDecTreeObjectDataList noOpIn) {
    super(id, "RbrDecisionTreeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrDecTreeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrDecisionTree", noOpIn);
      }
      addInput("RbrDecisionTree", mapList);
    }
  }
/**
 *
 * Retrieves the RbrDecTreeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrDecTreeObjectDataList getOutput() {
    return RbrDecTreeObjectHelper.fromMapList(outputMap, "RbrDecisionTreeList");
  }
}
