/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressServiceabilityValidateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAddressServiceabilityValidateNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressServiceabilityValidateNoOpRequest extends SvcAddrServiceabilityRequest {
/**
 *
 * Constructor to create a   ServiceAddressServiceabilityValidateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressServiceabilityValidateNoOpRequest(String id, SvcAddrObjectDataList noOpIn) {
    super(id, "ServiceAddressServiceabilityValidateNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SvcAddrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcAddrServiceability", noOpIn);
      }
      addInput("SvcAddrServiceability", mapList);
    }
  }
/**
 *
 * Retrieves the SvcAddrObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SvcAddrObjectDataList getOutput() {
    return SvcAddrObjectHelper.fromMapList(outputMap, "SvcAddrServiceabilityList");
  }
}
