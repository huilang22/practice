/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a LanguageCodeFindNoOpRequest Udt Request/Response
 *
 */
public class LanguageCodeFindNoOpRequest extends LanguageCodeRequest {
/**
 *
 * Constructor to create a   LanguageCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LanguageCodeFindNoOpRequest(String id, LCObjectDataList noOpIn) {
    super(id, "LanguageCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LanguageCode", noOpIn);
      }
      addInput("LanguageCode", mapList);
    }
  }
/**
 *
 * Retrieves the LCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LCObjectDataList getOutput() {
    return LCObjectHelper.fromMapList(outputMap, "LanguageCodeList");
  }
}
