/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a VanityCodeChargeMapFindNoOpRequest Udt Request/Response
 *
 */
public class VanityCodeChargeMapFindNoOpRequest extends VanityCodeChargeMapRequest {
/**
 *
 * Constructor to create a   VanityCodeChargeMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VanityCodeChargeMapFindNoOpRequest(String id, VanityCodeChargeObjDataList noOpIn) {
    super(id, "VanityCodeChargeMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VanityCodeChargeObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VanityCodeChargeMap", noOpIn);
      }
      addInput("VanityCodeChargeMap", mapList);
    }
  }
/**
 *
 * Retrieves the VanityCodeChargeObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VanityCodeChargeObjDataList getOutput() {
    return VanityCodeChargeObjHelper.fromMapList(outputMap, "VanityCodeChargeMapList");
  }
}
