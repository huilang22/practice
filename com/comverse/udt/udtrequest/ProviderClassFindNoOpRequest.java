/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassFindNoOpRequest.java
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
 * NoOp class used to simulate a ProviderClassFindNoOpRequest Udt Request/Response
 *
 */
public class ProviderClassFindNoOpRequest extends ProviderClassRequest {
/**
 *
 * Constructor to create a   ProviderClassFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProviderClassFindNoOpRequest(String id, ProvClsObjectDataList noOpIn) {
    super(id, "ProviderClassFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProvClsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProviderClass", noOpIn);
      }
      addInput("ProviderClass", mapList);
    }
  }
/**
 *
 * Retrieves the ProvClsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProvClsObjectDataList getOutput() {
    return ProvClsObjectHelper.fromMapList(outputMap, "ProviderClassList");
  }
}
