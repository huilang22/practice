/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideFindNoOpRequest.java
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
 * NoOp class used to simulate a CorridorRateBandOverrideFindNoOpRequest Udt Request/Response
 *
 */
public class CorridorRateBandOverrideFindNoOpRequest extends CorridorRateBandOverrideRequest {
/**
 *
 * Constructor to create a   CorridorRateBandOverrideFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorRateBandOverrideFindNoOpRequest(String id, CRBOObjectDataList noOpIn) {
    super(id, "CorridorRateBandOverrideFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CRBOObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorRateBandOverride", noOpIn);
      }
      addInput("CorridorRateBandOverride", mapList);
    }
  }
/**
 *
 * Retrieves the CRBOObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CRBOObjectDataList getOutput() {
    return CRBOObjectHelper.fromMapList(outputMap, "CorridorRateBandOverrideList");
  }
}
