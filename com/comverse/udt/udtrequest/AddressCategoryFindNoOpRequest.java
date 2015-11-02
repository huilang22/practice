/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryFindNoOpRequest.java
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
 * NoOp class used to simulate a AddressCategoryFindNoOpRequest Udt Request/Response
 *
 */
public class AddressCategoryFindNoOpRequest extends AddressCategoryRequest {
/**
 *
 * Constructor to create a   AddressCategoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressCategoryFindNoOpRequest(String id, AddressCategoryObjectDataList noOpIn) {
    super(id, "AddressCategoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AddressCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressCategory", noOpIn);
      }
      addInput("AddressCategory", mapList);
    }
  }
/**
 *
 * Retrieves the AddressCategoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AddressCategoryObjectDataList getOutput() {
    return AddressCategoryObjectHelper.fromMapList(outputMap, "AddressCategoryList");
  }
}
