/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindByServiceNoOpRequest.java
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
 * NoOp class used to simulate a NrcTransDescrFindByServiceNoOpRequest Udt Request/Response
 *
 */
public class NrcTransDescrFindByServiceNoOpRequest extends NrcTransDescrRequest {
/**
 *
 * Constructor to create a   NrcTransDescrFindByServiceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTransDescrFindByServiceNoOpRequest(String id, NrcTransDescrObjectDataList noOpIn) {
    super(id, "NrcTransDescrFindByServiceNoOpRequest");
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
