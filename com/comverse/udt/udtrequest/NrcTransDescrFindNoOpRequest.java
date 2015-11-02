/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindNoOpRequest.java
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
 * NoOp class used to simulate a NrcTransDescrFindNoOpRequest Udt Request/Response
 *
 */
public class NrcTransDescrFindNoOpRequest extends NrcTransDescrRequest {
/**
 *
 * Constructor to create a   NrcTransDescrFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTransDescrFindNoOpRequest(String id, NrcTransDescrObjectDataList noOpIn) {
    super(id, "NrcTransDescrFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NrcTransDescrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcTransDescr", noOpIn);
      }
      addInput("NrcTransDescr", mapList);
    }
  }
/**
 *
 * Retrieves the NrcTransDescrObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrObjectDataList getOutput() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
}
