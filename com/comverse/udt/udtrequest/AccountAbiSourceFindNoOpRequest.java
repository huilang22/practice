/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountAbiSourceFindNoOpRequest Udt Request/Response
 *
 */
public class AccountAbiSourceFindNoOpRequest extends AccountAbiSourceRequest {
/**
 *
 * Constructor to create a   AccountAbiSourceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountAbiSourceFindNoOpRequest(String id, AccountAbiSourceObjectDataList noOpIn) {
    super(id, "AccountAbiSourceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountAbiSourceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountAbiSource", noOpIn);
      }
      addInput("AccountAbiSource", mapList);
    }
  }
/**
 *
 * Retrieves the AccountAbiSourceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountAbiSourceObjectDataList getOutput() {
    return AccountAbiSourceObjectHelper.fromMapList(outputMap, "AccountAbiSourceList");
  }
}
