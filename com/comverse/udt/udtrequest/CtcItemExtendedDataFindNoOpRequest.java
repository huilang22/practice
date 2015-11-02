/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class CtcItemExtendedDataFindNoOpRequest extends CtcItemExtendedDataRequest {
/**
 *
 * Constructor to create a   CtcItemExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemExtendedDataFindNoOpRequest(String id, CtcItemExtendedDataObjectDataList noOpIn) {
    super(id, "CtcItemExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcItemExtendedDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemExtendedData", noOpIn);
      }
      addInput("CtcItemExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the CtcItemExtendedDataObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemExtendedDataObjectDataList getOutput() {
    return CtcItemExtendedDataObjectHelper.fromMapList(outputMap, "CtcItemExtendedDataList");
  }
}
