/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseInfoGetNoOpRequest.java
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
 * NoOp class used to simulate a ClearingHouseInfoGetNoOpRequest Udt Request/Response
 *
 */
public class ClearingHouseInfoGetNoOpRequest extends ClearingHouseInfoSubRequestParent {
/**
 *
 * Constructor to create a   ClearingHouseInfoGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClearingHouseInfoGetNoOpRequest(String id, ClearingHouseInfoObjectData noOpIn) {
    super(id, "ClearingHouseInfoGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectHelper.toMap(noOpIn, new HashMap(), "ClearingHouseInfo").get("ClearingHouseInfo"));
    }
  }
/**
 *
 * Retrieves the ClearingHouseInfoObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseInfoObjectData getOutput() {
    return ClearingHouseInfoObjectHelper.fromMap(outputMap, "ClearingHouseInfo");
  }
}
