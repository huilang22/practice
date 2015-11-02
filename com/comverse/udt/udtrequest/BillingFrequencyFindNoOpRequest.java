/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyFindNoOpRequest.java
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
 * NoOp class used to simulate a BillingFrequencyFindNoOpRequest Udt Request/Response
 *
 */
public class BillingFrequencyFindNoOpRequest extends BillingFrequencyRequest {
/**
 *
 * Constructor to create a   BillingFrequencyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillingFrequencyFindNoOpRequest(String id, BFObjectDataList noOpIn) {
    super(id, "BillingFrequencyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BFObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillingFrequency", noOpIn);
      }
      addInput("BillingFrequency", mapList);
    }
  }
/**
 *
 * Retrieves the BFObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BFObjectDataList getOutput() {
    return BFObjectHelper.fromMapList(outputMap, "BillingFrequencyList");
  }
}
