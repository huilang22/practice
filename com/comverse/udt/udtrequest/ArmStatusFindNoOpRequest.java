/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a ArmStatusFindNoOpRequest Udt Request/Response
 *
 */
public class ArmStatusFindNoOpRequest extends ArmStatusRequest {
/**
 *
 * Constructor to create a   ArmStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ArmStatusFindNoOpRequest(String id, ASObjectDataList noOpIn) {
    super(id, "ArmStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ASObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ArmStatus", noOpIn);
      }
      addInput("ArmStatus", mapList);
    }
  }
/**
 *
 * Retrieves the ASObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ASObjectDataList getOutput() {
    return ASObjectHelper.fromMapList(outputMap, "ArmStatusList");
  }
}
