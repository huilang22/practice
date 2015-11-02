/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressComponentServiceabilityValidateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAddressComponentServiceabilityValidateNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressComponentServiceabilityValidateNoOpRequest extends SvcAddrServiceabilityRequest {
/**
 *
 * Constructor to create a   ServiceAddressComponentServiceabilityValidateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressComponentServiceabilityValidateNoOpRequest(String id, ComponentObjectDataList noOpIn) {
    super(id, "ServiceAddressComponentServiceabilityValidateNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ComponentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Component", noOpIn);
      }
      addInput("Component", mapList);
    }
  }
/**
 *
 * Retrieves the ComponentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentObjectDataList getOutput() {
    return ComponentObjectHelper.fromMapList(outputMap, "ComponentList");
  }
}
