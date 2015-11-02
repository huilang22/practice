/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JurisdictionFindNoOpRequest.java
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
 * NoOp class used to simulate a JurisdictionFindNoOpRequest Udt Request/Response
 *
 */
public class JurisdictionFindNoOpRequest extends JurisdictionRequest {
/**
 *
 * Constructor to create a   JurisdictionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public JurisdictionFindNoOpRequest(String id, JurisdictionObjectDataList noOpIn) {
    super(id, "JurisdictionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = JurisdictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Jurisdiction", noOpIn);
      }
      addInput("Jurisdiction", mapList);
    }
  }
/**
 *
 * Retrieves the JurisdictionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public JurisdictionObjectDataList getOutput() {
    return JurisdictionObjectHelper.fromMapList(outputMap, "JurisdictionList");
  }
}
