/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalFindNoOpRequest.java
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
 * NoOp class used to simulate a AddressStreetDirectionalFindNoOpRequest Udt Request/Response
 *
 */
public class AddressStreetDirectionalFindNoOpRequest extends AddressStreetDirectionalRequest {
/**
 *
 * Constructor to create a   AddressStreetDirectionalFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressStreetDirectionalFindNoOpRequest(String id, AddressStreetDirectionalObjectDataList noOpIn) {
    super(id, "AddressStreetDirectionalFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AddressStreetDirectionalObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressStreetDirectional", noOpIn);
      }
      addInput("AddressStreetDirectional", mapList);
    }
  }
/**
 *
 * Retrieves the AddressStreetDirectionalObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetDirectionalObjectDataList getOutput() {
    return AddressStreetDirectionalObjectHelper.fromMapList(outputMap, "AddressStreetDirectionalList");
  }
}
