/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixFindNoOpRequest.java
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
 * NoOp class used to simulate a AddressStreetSuffixFindNoOpRequest Udt Request/Response
 *
 */
public class AddressStreetSuffixFindNoOpRequest extends AddressStreetSuffixRequest {
/**
 *
 * Constructor to create a   AddressStreetSuffixFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressStreetSuffixFindNoOpRequest(String id, AddressStreetSuffixObjectDataList noOpIn) {
    super(id, "AddressStreetSuffixFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AddressStreetSuffixObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressStreetSuffix", noOpIn);
      }
      addInput("AddressStreetSuffix", mapList);
    }
  }
/**
 *
 * Retrieves the AddressStreetSuffixObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetSuffixObjectDataList getOutput() {
    return AddressStreetSuffixObjectHelper.fromMapList(outputMap, "AddressStreetSuffixList");
  }
}
