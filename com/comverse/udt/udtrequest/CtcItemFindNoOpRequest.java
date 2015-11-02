/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemFindNoOpRequest Udt Request/Response
 *
 */
public class CtcItemFindNoOpRequest extends CtcItemRequest {
/**
 *
 * Constructor to create a   CtcItemFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemFindNoOpRequest(String id, CtcItemObjectDataList noOpIn) {
    super(id, "CtcItemFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItem", noOpIn);
      }
      addInput("CtcItem", mapList);
    }
  }
/**
 *
 * Retrieves the CtcItemObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemObjectDataList getOutput() {
    return CtcItemObjectHelper.fromMapList(outputMap, "CtcItemList");
  }
}
