/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultActionFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationAttributeDefaultActionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationAttributeDefaultActionFindNoOpRequest extends BsdApplicationAttributeDefaultRequest {
/**
 *
 * Constructor to create a   BsdApplicationAttributeDefaultActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationAttributeDefaultActionFindNoOpRequest(String id, BsdApplicationAttributeDefaultObjectDataList noOpIn) {
    super(id, "BsdApplicationAttributeDefaultActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdApplicationAttributeDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationAttributeDefault", noOpIn);
      }
      addInput("BsdApplicationAttributeDefault", mapList);
    }
  }
/**
 *
 * Retrieves the BsdApplicationAttributeDefaultObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeDefaultObjectDataList getOutput() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeDefaultList");
  }
}
