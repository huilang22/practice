/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractFindNoOpRequest.java
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
 * NoOp class used to simulate a GlobalContractFindNoOpRequest Udt Request/Response
 *
 */
public class GlobalContractFindNoOpRequest extends GlobalContractRequest {
/**
 *
 * Constructor to create a   GlobalContractFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalContractFindNoOpRequest(String id, GlobalContractObjectDataList noOpIn) {
    super(id, "GlobalContractFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GlobalContractObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GlobalContract", noOpIn);
      }
      addInput("GlobalContract", mapList);
    }
  }
/**
 *
 * Retrieves the GlobalContractObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalContractObjectDataList getOutput() {
    return GlobalContractObjectHelper.fromMapList(outputMap, "GlobalContractList");
  }
}
