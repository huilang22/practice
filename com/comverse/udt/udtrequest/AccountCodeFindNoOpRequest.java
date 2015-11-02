/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountCodeFindNoOpRequest Udt Request/Response
 *
 */
public class AccountCodeFindNoOpRequest extends AccountCodeRequest {
/**
 *
 * Constructor to create a   AccountCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCodeFindNoOpRequest(String id, AccountCodeObjectDataList noOpIn) {
    super(id, "AccountCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountCode", noOpIn);
      }
      addInput("AccountCode", mapList);
    }
  }
/**
 *
 * Retrieves the AccountCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeObjectDataList getOutput() {
    return AccountCodeObjectHelper.fromMapList(outputMap, "AccountCodeList");
  }
}
