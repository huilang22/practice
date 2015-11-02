/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapFindNoOpRequest.java
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
 * NoOp class used to simulate a ComponentPolicyMapFindNoOpRequest Udt Request/Response
 *
 */
public class ComponentPolicyMapFindNoOpRequest extends ComponentPolicyMapRequest {
/**
 *
 * Constructor to create a   ComponentPolicyMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentPolicyMapFindNoOpRequest(String id, ComponentPolicyMapObjectDataList noOpIn) {
    super(id, "ComponentPolicyMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ComponentPolicyMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ComponentPolicyMap", noOpIn);
      }
      addInput("ComponentPolicyMap", mapList);
    }
  }
/**
 *
 * Retrieves the ComponentPolicyMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentPolicyMapObjectDataList getOutput() {
    return ComponentPolicyMapObjectHelper.fromMapList(outputMap, "ComponentPolicyMapList");
  }
}
