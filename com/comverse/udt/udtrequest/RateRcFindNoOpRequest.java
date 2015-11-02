/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcFindNoOpRequest.java
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
 * NoOp class used to simulate a RateRcFindNoOpRequest Udt Request/Response
 *
 */
public class RateRcFindNoOpRequest extends RateRcRequest {
/**
 *
 * Constructor to create a   RateRcFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateRcFindNoOpRequest(String id, RACObjectDataList noOpIn) {
    super(id, "RateRcFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RACObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateRc", noOpIn);
      }
      addInput("RateRc", mapList);
    }
  }
/**
 *
 * Retrieves the RACObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RACObjectDataList getOutput() {
    return RACObjectHelper.fromMapList(outputMap, "RateRcList");
  }
}
