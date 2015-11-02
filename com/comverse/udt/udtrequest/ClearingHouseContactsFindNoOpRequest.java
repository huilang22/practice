/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseContactsFindNoOpRequest.java
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
 * NoOp class used to simulate a ClearingHouseContactsFindNoOpRequest Udt Request/Response
 *
 */
public class ClearingHouseContactsFindNoOpRequest extends ClearingHouseContactsRequest {
/**
 *
 * Constructor to create a   ClearingHouseContactsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClearingHouseContactsFindNoOpRequest(String id, ClearingHouseContactsObjectDataList noOpIn) {
    super(id, "ClearingHouseContactsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ClearingHouseContactsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClearingHouseContacts", noOpIn);
      }
      addInput("ClearingHouseContacts", mapList);
    }
  }
/**
 *
 * Retrieves the ClearingHouseContactsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseContactsObjectDataList getOutput() {
    return ClearingHouseContactsObjectHelper.fromMapList(outputMap, "ClearingHouseContactsList");
  }
}
