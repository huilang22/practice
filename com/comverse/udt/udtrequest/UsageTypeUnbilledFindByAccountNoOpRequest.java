/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnbilledFindByAccountNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeUnbilledFindByAccountNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeUnbilledFindByAccountNoOpRequest extends UsageTypeRequest {
/**
 *
 * Constructor to create a   UsageTypeUnbilledFindByAccountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeUnbilledFindByAccountNoOpRequest(String id, UsageTypeObjectDataList noOpIn) {
    super(id, "UsageTypeUnbilledFindByAccountNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsageTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageType", noOpIn);
      }
      addInput("UsageType", mapList);
    }
  }
/**
 *
 * Retrieves the UsageTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeObjectDataList getOutput() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
}
