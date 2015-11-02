/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideFindNoOpRequest.java
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
 * NoOp class used to simulate a BillModeOverrideFindNoOpRequest Udt Request/Response
 *
 */
public class BillModeOverrideFindNoOpRequest extends BillModeOverrideRequest {
/**
 *
 * Constructor to create a   BillModeOverrideFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillModeOverrideFindNoOpRequest(String id, BMOObjectDataList noOpIn) {
    super(id, "BillModeOverrideFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BMOObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillModeOverride", noOpIn);
      }
      addInput("BillModeOverride", mapList);
    }
  }
/**
 *
 * Retrieves the BMOObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BMOObjectDataList getOutput() {
    return BMOObjectHelper.fromMapList(outputMap, "BillModeOverrideList");
  }
}
