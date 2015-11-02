/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a UnitsTypeFindNoOpRequest Udt Request/Response
 *
 */
public class UnitsTypeFindNoOpRequest extends UnitsTypeRequest {
/**
 *
 * Constructor to create a   UnitsTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitsTypeFindNoOpRequest(String id, UnitsTypeObjectDataList noOpIn) {
    super(id, "UnitsTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UnitsTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitsType", noOpIn);
      }
      addInput("UnitsType", mapList);
    }
  }
/**
 *
 * Retrieves the UnitsTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UnitsTypeObjectDataList getOutput() {
    return UnitsTypeObjectHelper.fromMapList(outputMap, "UnitsTypeList");
  }
}
