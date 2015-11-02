/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BonusPointTransTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BonusPointTransTypeFindNoOpRequest extends BonusPointTransTypeRequest {
/**
 *
 * Constructor to create a   BonusPointTransTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BonusPointTransTypeFindNoOpRequest(String id, BonusPointTransTypeObjectDataList noOpIn) {
    super(id, "BonusPointTransTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BonusPointTransTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BonusPointTransType", noOpIn);
      }
      addInput("BonusPointTransType", mapList);
    }
  }
/**
 *
 * Retrieves the BonusPointTransTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointTransTypeObjectDataList getOutput() {
    return BonusPointTransTypeObjectHelper.fromMapList(outputMap, "BonusPointTransTypeList");
  }
}
