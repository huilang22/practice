/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a AdjTransGroupFindNoOpRequest Udt Request/Response
 *
 */
public class AdjTransGroupFindNoOpRequest extends AdjTransGroupRequest {
/**
 *
 * Constructor to create a   AdjTransGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjTransGroupFindNoOpRequest(String id, ATGObjectDataList noOpIn) {
    super(id, "AdjTransGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ATGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjTransGroup", noOpIn);
      }
      addInput("AdjTransGroup", mapList);
    }
  }
/**
 *
 * Retrieves the ATGObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ATGObjectDataList getOutput() {
    return ATGObjectHelper.fromMapList(outputMap, "AdjTransGroupList");
  }
}
