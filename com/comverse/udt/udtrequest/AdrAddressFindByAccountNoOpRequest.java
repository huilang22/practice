/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindByAccountNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AdrAddressFindByAccountNoOpRequest Udt Request/Response
 *
 */
public class AdrAddressFindByAccountNoOpRequest extends AdrAddressRequest {
/**
 *
 * Constructor to create a   AdrAddressFindByAccountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdrAddressFindByAccountNoOpRequest(String id, AdrAddressObjectDataList noOpIn) {
    super(id, "AdrAddressFindByAccountNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AdrAddressObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdrAddress", noOpIn);
      }
      addInput("AdrAddress", mapList);
    }
  }
/**
 *
 * Retrieves the AdrAddressObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AdrAddressObjectDataList getOutput() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
}
