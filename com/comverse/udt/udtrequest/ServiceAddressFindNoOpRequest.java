/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAddressFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressFindNoOpRequest extends ServiceAddressRequest {
/**
 *
 * Constructor to create a   ServiceAddressFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressFindNoOpRequest(String id, ServiceAddressObjectDataList noOpIn) {
    super(id, "ServiceAddressFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceAddressObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceAddress", noOpIn);
      }
      addInput("ServiceAddress", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceAddressObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressObjectDataList getOutput() {
    return ServiceAddressObjectHelper.fromMapList(outputMap, "ServiceAddressList");
  }
}
