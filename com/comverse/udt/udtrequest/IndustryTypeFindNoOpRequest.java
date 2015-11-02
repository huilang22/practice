/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a IndustryTypeFindNoOpRequest Udt Request/Response
 *
 */
public class IndustryTypeFindNoOpRequest extends IndustryTypeRequest {
/**
 *
 * Constructor to create a   IndustryTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public IndustryTypeFindNoOpRequest(String id, IndustryTypeObjectDataList noOpIn) {
    super(id, "IndustryTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = IndustryTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("IndustryType", noOpIn);
      }
      addInput("IndustryType", mapList);
    }
  }
/**
 *
 * Retrieves the IndustryTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public IndustryTypeObjectDataList getOutput() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
}
