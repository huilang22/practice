/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountCategoryFindNoOpRequest Udt Request/Response
 *
 */
public class AccountCategoryFindNoOpRequest extends AccountCategoryRequest {
/**
 *
 * Constructor to create a   AccountCategoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCategoryFindNoOpRequest(String id, ACObjectDataList noOpIn) {
    super(id, "AccountCategoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ACObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountCategory", noOpIn);
      }
      addInput("AccountCategory", mapList);
    }
  }
/**
 *
 * Retrieves the ACObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ACObjectDataList getOutput() {
    return ACObjectHelper.fromMapList(outputMap, "AccountCategoryList");
  }
}
