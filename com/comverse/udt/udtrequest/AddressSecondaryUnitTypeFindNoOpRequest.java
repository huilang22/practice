/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a AddressSecondaryUnitTypeFindNoOpRequest Udt Request/Response
 *
 */
public class AddressSecondaryUnitTypeFindNoOpRequest extends AddressSecondaryUnitTypeRequest {
/**
 *
 * Constructor to create a   AddressSecondaryUnitTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressSecondaryUnitTypeFindNoOpRequest(String id, AddressSecondaryUnitTypeObjectDataList noOpIn) {
    super(id, "AddressSecondaryUnitTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AddressSecondaryUnitTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressSecondaryUnitType", noOpIn);
      }
      addInput("AddressSecondaryUnitType", mapList);
    }
  }
/**
 *
 * Retrieves the AddressSecondaryUnitTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AddressSecondaryUnitTypeObjectDataList getOutput() {
    return AddressSecondaryUnitTypeObjectHelper.fromMapList(outputMap, "AddressSecondaryUnitTypeList");
  }
}
