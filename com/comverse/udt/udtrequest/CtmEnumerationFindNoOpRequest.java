/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationFindNoOpRequest.java
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
 * NoOp class used to simulate a CtmEnumerationFindNoOpRequest Udt Request/Response
 *
 */
public class CtmEnumerationFindNoOpRequest extends CtmEnumerationRequest {
/**
 *
 * Constructor to create a   CtmEnumerationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmEnumerationFindNoOpRequest(String id, CtmEnumerationObjectDataList noOpIn) {
    super(id, "CtmEnumerationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtmEnumerationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmEnumeration", noOpIn);
      }
      addInput("CtmEnumeration", mapList);
    }
  }
/**
 *
 * Retrieves the CtmEnumerationObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtmEnumerationObjectDataList getOutput() {
    return CtmEnumerationObjectHelper.fromMapList(outputMap, "CtmEnumerationList");
  }
}
