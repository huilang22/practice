/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdFindNoOpRequest.java
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
 * NoOp class used to simulate a CustomerLifetimeIdFindNoOpRequest Udt Request/Response
 *
 */
public class CustomerLifetimeIdFindNoOpRequest extends CustomerLifetimeIdRequest {
/**
 *
 * Constructor to create a   CustomerLifetimeIdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerLifetimeIdFindNoOpRequest(String id, CustomerLifetimeIdObjectDataList noOpIn) {
    super(id, "CustomerLifetimeIdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerLifetimeIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerLifetimeId", noOpIn);
      }
      addInput("CustomerLifetimeId", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerLifetimeIdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerLifetimeIdObjectDataList getOutput() {
    return CustomerLifetimeIdObjectHelper.fromMapList(outputMap, "CustomerLifetimeIdList");
  }
}
