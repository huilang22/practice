/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobsubstateFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsJobsubstateFindNoOpRequest Udt Request/Response
 *
 */
public class InvsJobsubstateFindNoOpRequest extends InvsJobsubstateRequest {
/**
 *
 * Constructor to create a   InvsJobsubstateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobsubstateFindNoOpRequest(String id, InvsJobsubstateObjectDataList noOpIn) {
    super(id, "InvsJobsubstateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsJobsubstateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobsubstate", noOpIn);
      }
      addInput("InvsJobsubstate", mapList);
    }
  }
/**
 *
 * Retrieves the InvsJobsubstateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobsubstateObjectDataList getOutput() {
    return InvsJobsubstateObjectHelper.fromMapList(outputMap, "InvsJobsubstateList");
  }
}
