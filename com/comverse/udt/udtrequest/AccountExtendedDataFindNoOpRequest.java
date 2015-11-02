/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class AccountExtendedDataFindNoOpRequest extends AccountRequest {
/**
 *
 * Constructor to create a   AccountExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountExtendedDataFindNoOpRequest(String id, AccountEDObjectDataList noOpIn) {
    super(id, "AccountExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountExtendedData", noOpIn);
      }
      addInput("AccountExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the AccountEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountEDObjectDataList getOutput() {
    return AccountEDObjectHelper.fromMapList(outputMap, "AccountExtendedDataList");
  }
}
