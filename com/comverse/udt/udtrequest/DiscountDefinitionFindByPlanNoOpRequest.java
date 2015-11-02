/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionFindByPlanNoOpRequest.java
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
 * NoOp class used to simulate a DiscountDefinitionFindByPlanNoOpRequest Udt Request/Response
 *
 */
public class DiscountDefinitionFindByPlanNoOpRequest extends DiscountDefinitionRequest {
/**
 *
 * Constructor to create a   DiscountDefinitionFindByPlanNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountDefinitionFindByPlanNoOpRequest(String id, DiscountDefinitionObjectDataList noOpIn) {
    super(id, "DiscountDefinitionFindByPlanNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DiscountDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountDefinition", noOpIn);
      }
      addInput("DiscountDefinition", mapList);
    }
  }
/**
 *
 * Retrieves the DiscountDefinitionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DiscountDefinitionObjectDataList getOutput() {
    return DiscountDefinitionObjectHelper.fromMapList(outputMap, "DiscountDefinitionList");
  }
}
