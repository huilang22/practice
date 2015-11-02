/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsCountryCodeFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsCountryCodeFindNoOpRequest Udt Request/Response
 *
 */
public class InvsCountryCodeFindNoOpRequest extends InvsCountryCodeRequest {
/**
 *
 * Constructor to create a   InvsCountryCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsCountryCodeFindNoOpRequest(String id, InvsCountryCodeObjectDataList noOpIn) {
    super(id, "InvsCountryCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsCountryCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsCountryCode", noOpIn);
      }
      addInput("InvsCountryCode", mapList);
    }
  }
/**
 *
 * Retrieves the InvsCountryCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsCountryCodeObjectDataList getOutput() {
    return InvsCountryCodeObjectHelper.fromMapList(outputMap, "InvsCountryCodeList");
  }
}
