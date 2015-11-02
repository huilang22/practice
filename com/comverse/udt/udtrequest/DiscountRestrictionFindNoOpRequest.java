/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionFindNoOpRequest.java
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
 * NoOp class used to simulate a DiscountRestrictionFindNoOpRequest Udt Request/Response
 *
 */
public class DiscountRestrictionFindNoOpRequest extends DiscountRestrictionRequest {
/**
 *
 * Constructor to create a   DiscountRestrictionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountRestrictionFindNoOpRequest(String id, DRObjectDataList noOpIn) {
    super(id, "DiscountRestrictionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DRObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountRestriction", noOpIn);
      }
      addInput("DiscountRestriction", mapList);
    }
  }
/**
 *
 * Retrieves the DRObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DRObjectDataList getOutput() {
    return DRObjectHelper.fromMapList(outputMap, "DiscountRestrictionList");
  }
}
