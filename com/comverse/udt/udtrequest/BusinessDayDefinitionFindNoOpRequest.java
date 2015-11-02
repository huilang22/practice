/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionFindNoOpRequest.java
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
 * NoOp class used to simulate a BusinessDayDefinitionFindNoOpRequest Udt Request/Response
 *
 */
public class BusinessDayDefinitionFindNoOpRequest extends BusinessDayDefinitionRequest {
/**
 *
 * Constructor to create a   BusinessDayDefinitionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BusinessDayDefinitionFindNoOpRequest(String id, BusinessDayDefinitionObjectDataList noOpIn) {
    super(id, "BusinessDayDefinitionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BusinessDayDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BusinessDayDefinition", noOpIn);
      }
      addInput("BusinessDayDefinition", mapList);
    }
  }
/**
 *
 * Retrieves the BusinessDayDefinitionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayDefinitionObjectDataList getOutput() {
    return BusinessDayDefinitionObjectHelper.fromMapList(outputMap, "BusinessDayDefinitionList");
  }
}
