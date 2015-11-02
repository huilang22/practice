/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountMessageFindNoOpRequest Udt Request/Response
 *
 */
public class AccountMessageFindNoOpRequest extends AccountMessageRequest {
/**
 *
 * Constructor to create a   AccountMessageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountMessageFindNoOpRequest(String id, AccountMessageObjectDataList noOpIn) {
    super(id, "AccountMessageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountMessageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountMessage", noOpIn);
      }
      addInput("AccountMessage", mapList);
    }
  }
/**
 *
 * Retrieves the AccountMessageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountMessageObjectDataList getOutput() {
    return AccountMessageObjectHelper.fromMapList(outputMap, "AccountMessageList");
  }
}
