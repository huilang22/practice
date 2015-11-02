/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a GenderTypeFindNoOpRequest Udt Request/Response
 *
 */
public class GenderTypeFindNoOpRequest extends GenderTypeRequest {
/**
 *
 * Constructor to create a   GenderTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GenderTypeFindNoOpRequest(String id, GenderTypeObjectDataList noOpIn) {
    super(id, "GenderTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GenderTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GenderType", noOpIn);
      }
      addInput("GenderType", mapList);
    }
  }
/**
 *
 * Retrieves the GenderTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GenderTypeObjectDataList getOutput() {
    return GenderTypeObjectHelper.fromMapList(outputMap, "GenderTypeList");
  }
}
