/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServComponentTypeFindNoOpRequest.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a ServComponentTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ServComponentTypeFindNoOpRequest extends ServComponentTypeRequest {
/**
 *
 * Constructor to create a   ServComponentTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServComponentTypeFindNoOpRequest(String id, CDObjectDataList noOpIn) {
    super(id, "ServComponentTypeFindNoOpRequest");
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
