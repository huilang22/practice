/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsVanityFindNoOpRequest Udt Request/Response
 *
 */
public class InvsVanityFindNoOpRequest extends InvsVanityRequest {
/**
 *
 * Constructor to create a   InvsVanityFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsVanityFindNoOpRequest(String id, InvsVanityObjectDataList noOpIn) {
    super(id, "InvsVanityFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsVanityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsVanity", noOpIn);
      }
      addInput("InvsVanity", mapList);
    }
  }
/**
 *
 * Retrieves the InvsVanityObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVanityObjectDataList getOutput() {
    return InvsVanityObjectHelper.fromMapList(outputMap, "InvsVanityList");
  }
}
