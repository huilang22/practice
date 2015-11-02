/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassFindNoOpRequest.java
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
 * NoOp class used to simulate a ExchangeRateClassFindNoOpRequest Udt Request/Response
 *
 */
public class ExchangeRateClassFindNoOpRequest extends ExchangeRateClassRequest {
/**
 *
 * Constructor to create a   ExchangeRateClassFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExchangeRateClassFindNoOpRequest(String id, ExchangeRateClassObjectDataList noOpIn) {
    super(id, "ExchangeRateClassFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ExchangeRateClassObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExchangeRateClass", noOpIn);
      }
      addInput("ExchangeRateClass", mapList);
    }
  }
/**
 *
 * Retrieves the ExchangeRateClassObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ExchangeRateClassObjectDataList getOutput() {
    return ExchangeRateClassObjectHelper.fromMapList(outputMap, "ExchangeRateClassList");
  }
}
