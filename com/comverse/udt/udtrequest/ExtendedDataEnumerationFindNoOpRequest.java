/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationFindNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataEnumerationFindNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataEnumerationFindNoOpRequest extends ExtendedDataEnumerationRequest {
/**
 *
 * Constructor to create a   ExtendedDataEnumerationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataEnumerationFindNoOpRequest(String id, EDObjectDataList noOpIn) {
    super(id, "ExtendedDataEnumerationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataEnumeration", noOpIn);
      }
      addInput("ExtendedDataEnumeration", mapList);
    }
  }
/**
 *
 * Retrieves the EDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EDObjectDataList getOutput() {
    return EDObjectHelper.fromMapList(outputMap, "ExtendedDataEnumerationList");
  }
}
