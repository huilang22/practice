/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsJobtypeFindNoOpRequest Udt Request/Response
 *
 */
public class InvsJobtypeFindNoOpRequest extends InvsJobtypeRequest {
/**
 *
 * Constructor to create a   InvsJobtypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobtypeFindNoOpRequest(String id, InvsJobtypeObjectDataList noOpIn) {
    super(id, "InvsJobtypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsJobtypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobtype", noOpIn);
      }
      addInput("InvsJobtype", mapList);
    }
  }
/**
 *
 * Retrieves the InvsJobtypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobtypeObjectDataList getOutput() {
    return InvsJobtypeObjectHelper.fromMapList(outputMap, "InvsJobtypeList");
  }
}
