/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeFindEligibleNoOpRequest.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a InvsTypeFindEligibleNoOpRequest Udt Request/Response
 *
 */
public class InvsTypeFindEligibleNoOpRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a   InvsTypeFindEligibleNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypeFindEligibleNoOpRequest(String id, InvsTypeObjectDataList noOpIn) {
    super(id, "InvsTypeFindEligibleNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsType", noOpIn);
      }
      addInput("InvsType", mapList);
    }
  }
/**
 *
 * Retrieves the InvsTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectDataList getOutput() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}
