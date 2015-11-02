/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupProductFindNoOpRequest Udt Request/Response
 *
 */
public class HqGroupProductFindNoOpRequest extends HqGroupProductRequest {
/**
 *
 * Constructor to create a   HqGroupProductFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupProductFindNoOpRequest(String id, HqGroupProductObjectDataList noOpIn) {
    super(id, "HqGroupProductFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqGroupProductObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupProduct", noOpIn);
      }
      addInput("HqGroupProduct", mapList);
    }
  }
/**
 *
 * Retrieves the HqGroupProductObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupProductObjectDataList getOutput() {
    return HqGroupProductObjectHelper.fromMapList(outputMap, "HqGroupProductList");
  }
}
