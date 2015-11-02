/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsInterfaceFindNoOpRequest Udt Request/Response
 *
 */
public class InvsInterfaceFindNoOpRequest extends InvsInterfaceRequest {
/**
 *
 * Constructor to create a   InvsInterfaceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsInterfaceFindNoOpRequest(String id, InvsInterfaceObjectDataList noOpIn) {
    super(id, "InvsInterfaceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsInterfaceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsInterface", noOpIn);
      }
      addInput("InvsInterface", mapList);
    }
  }
/**
 *
 * Retrieves the InvsInterfaceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsInterfaceObjectDataList getOutput() {
    return InvsInterfaceObjectHelper.fromMapList(outputMap, "InvsInterfaceList");
  }
}
