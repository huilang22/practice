/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdAcctMapFindNoOpRequest.java
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
 * NoOp class used to simulate a ExternalIdAcctMapFindNoOpRequest Udt Request/Response
 *
 */
public class ExternalIdAcctMapFindNoOpRequest extends ExternalIdAcctMapRequest {
/**
 *
 * Constructor to create a   ExternalIdAcctMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalIdAcctMapFindNoOpRequest(String id, EIAMObjectDataList noOpIn) {
    super(id, "ExternalIdAcctMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EIAMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalIdAcctMap", noOpIn);
      }
      addInput("ExternalIdAcctMap", mapList);
    }
  }
/**
 *
 * Retrieves the EIAMObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EIAMObjectDataList getOutput() {
    return EIAMObjectHelper.fromMapList(outputMap, "ExternalIdAcctMapList");
  }
}
