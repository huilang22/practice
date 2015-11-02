/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a CurrencyGroupFindNoOpRequest Udt Request/Response
 *
 */
public class CurrencyGroupFindNoOpRequest extends CurrencyGroupRequest {
/**
 *
 * Constructor to create a   CurrencyGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CurrencyGroupFindNoOpRequest(String id, CurrencyGroupObjectDataList noOpIn) {
    super(id, "CurrencyGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CurrencyGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CurrencyGroup", noOpIn);
      }
      addInput("CurrencyGroup", mapList);
    }
  }
/**
 *
 * Retrieves the CurrencyGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CurrencyGroupObjectDataList getOutput() {
    return CurrencyGroupObjectHelper.fromMapList(outputMap, "CurrencyGroupList");
  }
}
