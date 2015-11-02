/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeFindEligibleNoOpRequest.java
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
 * NoOp class used to simulate a ExternalIdTypeFindEligibleNoOpRequest Udt Request/Response
 *
 */
public class ExternalIdTypeFindEligibleNoOpRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a   ExternalIdTypeFindEligibleNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalIdTypeFindEligibleNoOpRequest(String id, ExternalIdTypeObjectDataList noOpIn) {
    super(id, "ExternalIdTypeFindEligibleNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ExternalIdTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalIdType", noOpIn);
      }
      addInput("ExternalIdType", mapList);
    }
  }
/**
 *
 * Retrieves the ExternalIdTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalIdTypeObjectDataList getOutput() {
    return ExternalIdTypeObjectHelper.fromMapList(outputMap, "ExternalIdTypeList");
  }
}
