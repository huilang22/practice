/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesFindNoOpRequest.java
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
 * NoOp class used to simulate a AbiBillMessagesFindNoOpRequest Udt Request/Response
 *
 */
public class AbiBillMessagesFindNoOpRequest extends AbiBillMessagesRequest {
/**
 *
 * Constructor to create a   AbiBillMessagesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiBillMessagesFindNoOpRequest(String id, AbiBillMessagesObjectDataList noOpIn) {
    super(id, "AbiBillMessagesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AbiBillMessagesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AbiBillMessages", noOpIn);
      }
      addInput("AbiBillMessages", mapList);
    }
  }
/**
 *
 * Retrieves the AbiBillMessagesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillMessagesObjectDataList getOutput() {
    return AbiBillMessagesObjectHelper.fromMapList(outputMap, "AbiBillMessagesList");
  }
}
