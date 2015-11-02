/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyFindNoOpRequest.java
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
 * NoOp class used to simulate a PolicyFindNoOpRequest Udt Request/Response
 *
 */
public class PolicyFindNoOpRequest extends PolicyRequest {
/**
 *
 * Constructor to create a   PolicyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PolicyFindNoOpRequest(String id, PolicyObjectDataList noOpIn) {
    super(id, "PolicyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PolicyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Policy", noOpIn);
      }
      addInput("Policy", mapList);
    }
  }
/**
 *
 * Retrieves the PolicyObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyObjectDataList getOutput() {
    return PolicyObjectHelper.fromMapList(outputMap, "PolicyList");
  }
}
