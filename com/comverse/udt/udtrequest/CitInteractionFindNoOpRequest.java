/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionFindNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitInteractionFindNoOpRequest Udt Request/Response
 *
 */
public class CitInteractionFindNoOpRequest extends CitInteractionRequest {
/**
 *
 * Constructor to create a   CitInteractionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitInteractionFindNoOpRequest(String id, CitInteractionObjectDataList noOpIn) {
    super(id, "CitInteractionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitInteractionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitInteraction", noOpIn);
      }
      addInput("CitInteraction", mapList);
    }
  }
/**
 *
 * Retrieves the CitInteractionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitInteractionObjectDataList getOutput() {
    return CitInteractionObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
}
