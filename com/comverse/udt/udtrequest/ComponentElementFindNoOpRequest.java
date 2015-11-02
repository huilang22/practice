/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ComponentElementFindNoOpRequest Udt Request/Response
 *
 */
public class ComponentElementFindNoOpRequest extends ComponentElementRequest {
/**
 *
 * Constructor to create a   ComponentElementFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentElementFindNoOpRequest(String id, ComponentElementObjectDataList noOpIn) {
    super(id, "ComponentElementFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ComponentElementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ComponentElement", noOpIn);
      }
      addInput("ComponentElement", mapList);
    }
  }
/**
 *
 * Retrieves the ComponentElementObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentElementObjectDataList getOutput() {
    return ComponentElementObjectHelper.fromMapList(outputMap, "ComponentElementList");
  }
}
