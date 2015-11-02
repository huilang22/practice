/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a EftResponseCodeFindNoOpRequest Udt Request/Response
 *
 */
public class EftResponseCodeFindNoOpRequest extends EftResponseCodeRequest {
/**
 *
 * Constructor to create a   EftResponseCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EftResponseCodeFindNoOpRequest(String id, EftResponseCodeObjectDataList noOpIn) {
    super(id, "EftResponseCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EftResponseCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EftResponseCode", noOpIn);
      }
      addInput("EftResponseCode", mapList);
    }
  }
/**
 *
 * Retrieves the EftResponseCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EftResponseCodeObjectDataList getOutput() {
    return EftResponseCodeObjectHelper.fromMapList(outputMap, "EftResponseCodeList");
  }
}
