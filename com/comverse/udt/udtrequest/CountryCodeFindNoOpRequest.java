/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a CountryCodeFindNoOpRequest Udt Request/Response
 *
 */
public class CountryCodeFindNoOpRequest extends CountryCodeRequest {
/**
 *
 * Constructor to create a   CountryCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CountryCodeFindNoOpRequest(String id, CountryCodeObjectDataList noOpIn) {
    super(id, "CountryCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CountryCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CountryCode", noOpIn);
      }
      addInput("CountryCode", mapList);
    }
  }
/**
 *
 * Retrieves the CountryCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CountryCodeObjectDataList getOutput() {
    return CountryCodeObjectHelper.fromMapList(outputMap, "CountryCodeList");
  }
}
