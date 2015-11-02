/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a AdrAddressExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class AdrAddressExtendedDataFindNoOpRequest extends AdrAddressRequest {
/**
 *
 * Constructor to create a   AdrAddressExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdrAddressExtendedDataFindNoOpRequest(String id, AdrAddressEDObjectDataList noOpIn) {
    super(id, "AdrAddressExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AdrAddressEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdrAddressExtendedData", noOpIn);
      }
      addInput("AdrAddressExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the AdrAddressEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AdrAddressEDObjectDataList getOutput() {
    return AdrAddressEDObjectHelper.fromMapList(outputMap, "AdrAddressExtendedDataList");
  }
}
