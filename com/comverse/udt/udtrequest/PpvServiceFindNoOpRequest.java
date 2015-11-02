/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvServiceFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a PpvServiceFindNoOpRequest Udt Request/Response
 *
 */
public class PpvServiceFindNoOpRequest extends PpvServiceRequest {
/**
 *
 * Constructor to create a   PpvServiceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PpvServiceFindNoOpRequest(String id, PpvServiceObjectDataList noOpIn) {
    super(id, "PpvServiceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PpvServiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PpvService", noOpIn);
      }
      addInput("PpvService", mapList);
    }
  }
/**
 *
 * Retrieves the PpvServiceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PpvServiceObjectDataList getOutput() {
    return PpvServiceObjectHelper.fromMapList(outputMap, "PpvServiceList");
  }
}
