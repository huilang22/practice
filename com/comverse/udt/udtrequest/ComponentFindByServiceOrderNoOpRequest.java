/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentFindByServiceOrderNoOpRequest.java
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
 * NoOp class used to simulate a ComponentFindByServiceOrderNoOpRequest Udt Request/Response
 *
 */
public class ComponentFindByServiceOrderNoOpRequest extends ComponentRequest {
/**
 *
 * Constructor to create a   ComponentFindByServiceOrderNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentFindByServiceOrderNoOpRequest(String id, ComponentObjectBaseDataList noOpIn) {
    super(id, "ComponentFindByServiceOrderNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ComponentObjectBaseHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Component", noOpIn);
      }
      addInput("Component", mapList);
    }
  }
/**
 *
 * Retrieves the ComponentObjectBaseDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentObjectBaseDataList getOutput() {
    return ComponentObjectBaseHelper.fromMapList(outputMap, "ComponentList");
  }
}
