/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetFindNoOpRequest.java
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
 * NoOp class used to simulate a DiscountTargetFindNoOpRequest Udt Request/Response
 *
 */
public class DiscountTargetFindNoOpRequest extends DiscountTargetRequest {
/**
 *
 * Constructor to create a   DiscountTargetFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountTargetFindNoOpRequest(String id, DTObjectDataList noOpIn) {
    super(id, "DiscountTargetFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountTarget", noOpIn);
      }
      addInput("DiscountTarget", mapList);
    }
  }
/**
 *
 * Retrieves the DTObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DTObjectDataList getOutput() {
    return DTObjectHelper.fromMapList(outputMap, "DiscountTargetList");
  }
}
