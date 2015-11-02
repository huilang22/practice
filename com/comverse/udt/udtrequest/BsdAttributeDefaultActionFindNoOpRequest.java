/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultActionFindNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdAttributeDefaultActionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeDefaultActionFindNoOpRequest extends BsdAttributeDefaultRequest {
/**
 *
 * Constructor to create a   BsdAttributeDefaultActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeDefaultActionFindNoOpRequest(String id, BsdAttributeDefaultObjectDataList noOpIn) {
    super(id, "BsdAttributeDefaultActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdAttributeDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeDefault", noOpIn);
      }
      addInput("BsdAttributeDefault", mapList);
    }
  }
/**
 *
 * Retrieves the BsdAttributeDefaultObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeDefaultObjectDataList getOutput() {
    return BsdAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdAttributeDefaultList");
  }
}
