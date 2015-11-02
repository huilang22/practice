/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDeleteListNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a CustomerIdEquipMapDeleteListNoOpRequest Udt Request/Response
 *
 */
public class CustomerIdEquipMapDeleteListNoOpRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a   CustomerIdEquipMapDeleteListNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerIdEquipMapDeleteListNoOpRequest(String id, CustomerIdEquipMapObjectDataList noOpIn) {
    super(id, "CustomerIdEquipMapDeleteListNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerIdEquipMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerIdEquipMap", noOpIn);
      }
      addInput("CustomerIdEquipMap", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerIdEquipMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerIdEquipMapObjectDataList getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
}
