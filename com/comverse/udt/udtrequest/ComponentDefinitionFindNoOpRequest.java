/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionFindNoOpRequest.java
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
 * NoOp class used to simulate a ComponentDefinitionFindNoOpRequest Udt Request/Response
 *
 */
public class ComponentDefinitionFindNoOpRequest extends ComponentDefinitionRequest {
/**
 *
 * Constructor to create a   ComponentDefinitionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentDefinitionFindNoOpRequest(String id, CDObjectDataList noOpIn) {
    super(id, "ComponentDefinitionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ComponentDefinition", noOpIn);
      }
      addInput("ComponentDefinition", mapList);
    }
  }
/**
 *
 * Retrieves the CDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CDObjectDataList getOutput() {
    return CDObjectHelper.fromMapList(outputMap, "ComponentDefinitionList");
  }
}
