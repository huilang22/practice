/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentFindNoOpRequest.java
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
 * NoOp class used to simulate a ChargeDistribPercentFindNoOpRequest Udt Request/Response
 *
 */
public class ChargeDistribPercentFindNoOpRequest extends ChargeDistribPercentRequest {
/**
 *
 * Constructor to create a   ChargeDistribPercentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ChargeDistribPercentFindNoOpRequest(String id, ChargeDistribPercentObjectDataList noOpIn) {
    super(id, "ChargeDistribPercentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ChargeDistribPercentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ChargeDistribPercent", noOpIn);
      }
      addInput("ChargeDistribPercent", mapList);
    }
  }
/**
 *
 * Retrieves the ChargeDistribPercentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDistribPercentObjectDataList getOutput() {
    return ChargeDistribPercentObjectHelper.fromMapList(outputMap, "ChargeDistribPercentList");
  }
}
