/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountCodeGroupFindNoOpRequest Udt Request/Response
 *
 */
public class AccountCodeGroupFindNoOpRequest extends AccountCodeGroupRequest {
/**
 *
 * Constructor to create a   AccountCodeGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCodeGroupFindNoOpRequest(String id, AccountCodeGroupObjectDataList noOpIn) {
    super(id, "AccountCodeGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountCodeGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountCodeGroup", noOpIn);
      }
      addInput("AccountCodeGroup", mapList);
    }
  }
/**
 *
 * Retrieves the AccountCodeGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeGroupObjectDataList getOutput() {
    return AccountCodeGroupObjectHelper.fromMapList(outputMap, "AccountCodeGroupList");
  }
}
