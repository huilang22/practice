/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a FranchiseCodeFindNoOpRequest Udt Request/Response
 *
 */
public class FranchiseCodeFindNoOpRequest extends FranchiseCodeRequest {
/**
 *
 * Constructor to create a   FranchiseCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public FranchiseCodeFindNoOpRequest(String id, FranchiseCodeObjectDataList noOpIn) {
    super(id, "FranchiseCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = FranchiseCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("FranchiseCode", noOpIn);
      }
      addInput("FranchiseCode", mapList);
    }
  }
/**
 *
 * Retrieves the FranchiseCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public FranchiseCodeObjectDataList getOutput() {
    return FranchiseCodeObjectHelper.fromMapList(outputMap, "FranchiseCodeList");
  }
}
