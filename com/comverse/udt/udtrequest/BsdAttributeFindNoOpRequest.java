/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeFindNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeFindNoOpRequest extends BsdAttributeRequest {
/**
 *
 * Constructor to create a   BsdAttributeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeFindNoOpRequest(String id, BsdAttributeObjectDataList noOpIn) {
    super(id, "BsdAttributeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdAttributeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttribute", noOpIn);
      }
      addInput("BsdAttribute", mapList);
    }
  }
/**
 *
 * Retrieves the BsdAttributeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeObjectDataList getOutput() {
    return BsdAttributeObjectHelper.fromMapList(outputMap, "BsdAttributeList");
  }
}
