/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionFindNoOpRequest.java
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
 * NoOp class used to simulate a UsageJurisdictionFindNoOpRequest Udt Request/Response
 *
 */
public class UsageJurisdictionFindNoOpRequest extends UsageJurisdictionRequest {
/**
 *
 * Constructor to create a   UsageJurisdictionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageJurisdictionFindNoOpRequest(String id, UsageJurisdictionObjectDataList noOpIn) {
    super(id, "UsageJurisdictionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsageJurisdictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageJurisdiction", noOpIn);
      }
      addInput("UsageJurisdiction", mapList);
    }
  }
/**
 *
 * Retrieves the UsageJurisdictionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsageJurisdictionObjectDataList getOutput() {
    return UsageJurisdictionObjectHelper.fromMapList(outputMap, "UsageJurisdictionList");
  }
}
