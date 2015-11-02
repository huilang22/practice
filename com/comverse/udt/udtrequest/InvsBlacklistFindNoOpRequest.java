/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsBlacklistFindNoOpRequest Udt Request/Response
 *
 */
public class InvsBlacklistFindNoOpRequest extends InvsBlacklistRequest {
/**
 *
 * Constructor to create a   InvsBlacklistFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsBlacklistFindNoOpRequest(String id, InvsBlacklistObjectDataList noOpIn) {
    super(id, "InvsBlacklistFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsBlacklistObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsBlacklist", noOpIn);
      }
      addInput("InvsBlacklist", mapList);
    }
  }
/**
 *
 * Retrieves the InvsBlacklistObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsBlacklistObjectDataList getOutput() {
    return InvsBlacklistObjectHelper.fromMapList(outputMap, "InvsBlacklistList");
  }
}
