/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a AddressTypeFindNoOpRequest Udt Request/Response
 *
 */
public class AddressTypeFindNoOpRequest extends AddressTypeRequest {
/**
 *
 * Constructor to create a   AddressTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressTypeFindNoOpRequest(String id, AddressTypeObjectDataList noOpIn) {
    super(id, "AddressTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AddressTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressType", noOpIn);
      }
      addInput("AddressType", mapList);
    }
  }
/**
 *
 * Retrieves the AddressTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AddressTypeObjectDataList getOutput() {
    return AddressTypeObjectHelper.fromMapList(outputMap, "AddressTypeList");
  }
}
