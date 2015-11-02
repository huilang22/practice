/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorDeleteListNoOpRequest.java
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
 * NoOp class used to simulate a CorridorDeleteListNoOpRequest Udt Request/Response
 *
 */
public class CorridorDeleteListNoOpRequest extends CorridorRequest {
/**
 *
 * Constructor to create a   CorridorDeleteListNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorDeleteListNoOpRequest(String id, CorridorObjectDataList noOpIn) {
    super(id, "CorridorDeleteListNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CorridorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Corridor", noOpIn);
      }
      addInput("Corridor", mapList);
    }
  }
/**
 *
 * Retrieves the CorridorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CorridorObjectDataList getOutput() {
    return CorridorObjectHelper.fromMapList(outputMap, "CorridorList");
  }
}
