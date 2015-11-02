/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionFindNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrDefinitionFindNoOpRequest Udt Request/Response
 *
 */
public class UnitCrDefinitionFindNoOpRequest extends UnitCrDefinitionRequest {
/**
 *
 * Constructor to create a   UnitCrDefinitionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrDefinitionFindNoOpRequest(String id, UnitCrDefinitionObjectDataList noOpIn) {
    super(id, "UnitCrDefinitionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UnitCrDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrDefinition", noOpIn);
      }
      addInput("UnitCrDefinition", mapList);
    }
  }
/**
 *
 * Retrieves the UnitCrDefinitionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrDefinitionObjectDataList getOutput() {
    return UnitCrDefinitionObjectHelper.fromMapList(outputMap, "UnitCrDefinitionList");
  }
}
