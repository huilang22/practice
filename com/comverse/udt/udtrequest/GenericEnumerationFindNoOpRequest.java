/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationFindNoOpRequest.java
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
 * NoOp class used to simulate a GenericEnumerationFindNoOpRequest Udt Request/Response
 *
 */
public class GenericEnumerationFindNoOpRequest extends GenericEnumerationRequest {
/**
 *
 * Constructor to create a   GenericEnumerationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GenericEnumerationFindNoOpRequest(String id, GEObjectDataList noOpIn) {
    super(id, "GenericEnumerationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GEObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GenericEnumeration", noOpIn);
      }
      addInput("GenericEnumeration", mapList);
    }
  }
/**
 *
 * Retrieves the GEObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GEObjectDataList getOutput() {
    return GEObjectHelper.fromMapList(outputMap, "GenericEnumerationList");
  }
}
