/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrRateTableFindNoOpRequest Udt Request/Response
 *
 */
public class RbrRateTableFindNoOpRequest extends RbrRateTableRequest {
/**
 *
 * Constructor to create a   RbrRateTableFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateTableFindNoOpRequest(String id, RbrRateTableObjectDataList noOpIn) {
    super(id, "RbrRateTableFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrRateTableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrRateTable", noOpIn);
      }
      addInput("RbrRateTable", mapList);
    }
  }
/**
 *
 * Retrieves the RbrRateTableObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRateTableObjectDataList getOutput() {
    return RbrRateTableObjectHelper.fromMapList(outputMap, "RbrRateTableList");
  }
}
