/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiFindNoOpRequest.java
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
 * NoOp class used to simulate a EpiFindNoOpRequest Udt Request/Response
 *
 */
public class EpiFindNoOpRequest extends EpiRequest {
/**
 *
 * Constructor to create a   EpiFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EpiFindNoOpRequest(String id, EpiObjectDataList noOpIn) {
    super(id, "EpiFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EpiObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Epi", noOpIn);
      }
      addInput("Epi", mapList);
    }
  }
/**
 *
 * Retrieves the EpiObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EpiObjectDataList getOutput() {
    return EpiObjectHelper.fromMapList(outputMap, "EpiList");
  }
}
