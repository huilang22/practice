/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucFindNoOpRequest.java
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
 * NoOp class used to simulate a AbiNrcDucFindNoOpRequest Udt Request/Response
 *
 */
public class AbiNrcDucFindNoOpRequest extends AbiNrcDucRequest {
/**
 *
 * Constructor to create a   AbiNrcDucFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiNrcDucFindNoOpRequest(String id, AbiNrcDucObjectDataList noOpIn) {
    super(id, "AbiNrcDucFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AbiNrcDucObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AbiNrcDuc", noOpIn);
      }
      addInput("AbiNrcDuc", mapList);
    }
  }
/**
 *
 * Retrieves the AbiNrcDucObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AbiNrcDucObjectDataList getOutput() {
    return AbiNrcDucObjectHelper.fromMapList(outputMap, "AbiNrcDucList");
  }
}
