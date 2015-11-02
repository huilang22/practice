/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommFindNoOpRequest.java
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
 * NoOp class used to simulate a TaxTypeCommFindNoOpRequest Udt Request/Response
 *
 */
public class TaxTypeCommFindNoOpRequest extends TaxTypeCommRequest {
/**
 *
 * Constructor to create a   TaxTypeCommFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxTypeCommFindNoOpRequest(String id, TTCObjectDataList noOpIn) {
    super(id, "TaxTypeCommFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TTCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxTypeComm", noOpIn);
      }
      addInput("TaxTypeComm", mapList);
    }
  }
/**
 *
 * Retrieves the TTCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TTCObjectDataList getOutput() {
    return TTCObjectHelper.fromMapList(outputMap, "TaxTypeCommList");
  }
}
