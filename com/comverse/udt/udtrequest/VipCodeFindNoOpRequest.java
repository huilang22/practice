/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a VipCodeFindNoOpRequest Udt Request/Response
 *
 */
public class VipCodeFindNoOpRequest extends VipCodeRequest {
/**
 *
 * Constructor to create a   VipCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VipCodeFindNoOpRequest(String id, VipCodeObjectDataList noOpIn) {
    super(id, "VipCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VipCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VipCode", noOpIn);
      }
      addInput("VipCode", mapList);
    }
  }
/**
 *
 * Retrieves the VipCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VipCodeObjectDataList getOutput() {
    return VipCodeObjectHelper.fromMapList(outputMap, "VipCodeList");
  }
}
