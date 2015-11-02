/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a SpecialDestinationTypeFindNoOpRequest Udt Request/Response
 *
 */
public class SpecialDestinationTypeFindNoOpRequest extends SpecialDestinationTypeRequest {
/**
 *
 * Constructor to create a   SpecialDestinationTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SpecialDestinationTypeFindNoOpRequest(String id, SpecialDestinationTypeObjectDataList noOpIn) {
    super(id, "SpecialDestinationTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SpecialDestinationTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SpecialDestinationType", noOpIn);
      }
      addInput("SpecialDestinationType", mapList);
    }
  }
/**
 *
 * Retrieves the SpecialDestinationTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SpecialDestinationTypeObjectDataList getOutput() {
    return SpecialDestinationTypeObjectHelper.fromMapList(outputMap, "SpecialDestinationTypeList");
  }
}
