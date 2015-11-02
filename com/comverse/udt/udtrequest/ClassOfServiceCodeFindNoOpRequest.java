/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a ClassOfServiceCodeFindNoOpRequest Udt Request/Response
 *
 */
public class ClassOfServiceCodeFindNoOpRequest extends ClassOfServiceCodeRequest {
/**
 *
 * Constructor to create a   ClassOfServiceCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClassOfServiceCodeFindNoOpRequest(String id, COSCObjectDataList noOpIn) {
    super(id, "ClassOfServiceCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = COSCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClassOfServiceCode", noOpIn);
      }
      addInput("ClassOfServiceCode", mapList);
    }
  }
/**
 *
 * Retrieves the COSCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public COSCObjectDataList getOutput() {
    return COSCObjectHelper.fromMapList(outputMap, "ClassOfServiceCodeList");
  }
}
