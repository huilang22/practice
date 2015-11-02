/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationFindNoOpRequest.java
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
 * NoOp class used to simulate a EmfConfigurationFindNoOpRequest Udt Request/Response
 *
 */
public class EmfConfigurationFindNoOpRequest extends EmfConfigurationRequest {
/**
 *
 * Constructor to create a   EmfConfigurationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EmfConfigurationFindNoOpRequest(String id, EmfConfigurationObjectDataList noOpIn) {
    super(id, "EmfConfigurationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EmfConfigurationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EmfConfiguration", noOpIn);
      }
      addInput("EmfConfiguration", mapList);
    }
  }
/**
 *
 * Retrieves the EmfConfigurationObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigurationObjectDataList getOutput() {
    return EmfConfigurationObjectHelper.fromMapList(outputMap, "EmfConfigurationList");
  }
}
