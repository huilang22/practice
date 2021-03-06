/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a TechnicianFindNoOpRequest Udt Request/Response
 *
 */
public class TechnicianFindNoOpRequest extends TechnicianRequest {
/**
 *
 * Constructor to create a   TechnicianFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TechnicianFindNoOpRequest(String id, TechnicianObjectDataList noOpIn) {
    super(id, "TechnicianFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TechnicianObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Technician", noOpIn);
      }
      addInput("Technician", mapList);
    }
  }
/**
 *
 * Retrieves the TechnicianObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TechnicianObjectDataList getOutput() {
    return TechnicianObjectHelper.fromMapList(outputMap, "TechnicianList");
  }
}
