/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsTypePriceLookupMapFindNoOpRequest Udt Request/Response
 *
 */
public class InvsTypePriceLookupMapFindNoOpRequest extends InvsTypePriceLookupMapRequest {
/**
 *
 * Constructor to create a   InvsTypePriceLookupMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypePriceLookupMapFindNoOpRequest(String id, InvsTypePriceLookupMapObjectDataList noOpIn) {
    super(id, "InvsTypePriceLookupMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsTypePriceLookupMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsTypePriceLookupMap", noOpIn);
      }
      addInput("InvsTypePriceLookupMap", mapList);
    }
  }
/**
 *
 * Retrieves the InvsTypePriceLookupMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypePriceLookupMapObjectDataList getOutput() {
    return InvsTypePriceLookupMapObjectHelper.fromMapList(outputMap, "InvsTypePriceLookupMapList");
  }
}
