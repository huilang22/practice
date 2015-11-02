/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerFindNoOpRequest.java
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
 * NoOp class used to simulate a TicklerFindNoOpRequest Udt Request/Response
 *
 */
public class TicklerFindNoOpRequest extends TicklerRequest {
/**
 *
 * Constructor to create a   TicklerFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TicklerFindNoOpRequest(String id, TicklerObjectDataList noOpIn) {
    super(id, "TicklerFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TicklerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Tickler", noOpIn);
      }
      addInput("Tickler", mapList);
    }
  }
/**
 *
 * Retrieves the TicklerObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TicklerObjectDataList getOutput() {
    return TicklerObjectHelper.fromMapList(outputMap, "TicklerList");
  }
}
