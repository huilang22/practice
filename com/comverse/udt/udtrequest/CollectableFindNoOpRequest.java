/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectableFindNoOpRequest.java
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

import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a CollectableFindNoOpRequest Udt Request/Response
 *
 */
public class CollectableFindNoOpRequest extends CollectableRequest {
/**
 *
 * Constructor to create a   CollectableFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CollectableFindNoOpRequest(String id, CollectableObjectDataList noOpIn) {
    super(id, "CollectableFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CollectableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Collectable", noOpIn);
      }
      addInput("Collectable", mapList);
    }
  }
/**
 *
 * Retrieves the CollectableObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CollectableObjectDataList getOutput() {
    return CollectableObjectHelper.fromMapList(outputMap, "CollectableList");
  }
}
