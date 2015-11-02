/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatFindNoOpRequest.java
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
 * NoOp class used to simulate a ChargeDisplayFormatFindNoOpRequest Udt Request/Response
 *
 */
public class ChargeDisplayFormatFindNoOpRequest extends ChargeDisplayFormatRequest {
/**
 *
 * Constructor to create a   ChargeDisplayFormatFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ChargeDisplayFormatFindNoOpRequest(String id, ChargeDisplayFormatObjectDataList noOpIn) {
    super(id, "ChargeDisplayFormatFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ChargeDisplayFormatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ChargeDisplayFormat", noOpIn);
      }
      addInput("ChargeDisplayFormat", mapList);
    }
  }
/**
 *
 * Retrieves the ChargeDisplayFormatObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDisplayFormatObjectDataList getOutput() {
    return ChargeDisplayFormatObjectHelper.fromMapList(outputMap, "ChargeDisplayFormatList");
  }
}
