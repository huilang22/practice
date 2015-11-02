/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionFindNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrRestrictionFindNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRestrictionFindNoOpRequest extends UnitCrRestrictionRequest {
/**
 *
 * Constructor to create a   UnitCrRestrictionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRestrictionFindNoOpRequest(String id, UnitCrRestrictionObjectDataList noOpIn) {
    super(id, "UnitCrRestrictionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UnitCrRestrictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrRestriction", noOpIn);
      }
      addInput("UnitCrRestriction", mapList);
    }
  }
/**
 *
 * Retrieves the UnitCrRestrictionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRestrictionObjectDataList getOutput() {
    return UnitCrRestrictionObjectHelper.fromMapList(outputMap, "UnitCrRestrictionList");
  }
}
