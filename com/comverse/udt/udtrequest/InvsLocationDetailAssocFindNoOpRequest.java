/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsLocationDetailAssocFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationDetailAssocFindNoOpRequest extends InvsLocationDetailAssocRequest {
/**
 *
 * Constructor to create a   InvsLocationDetailAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationDetailAssocFindNoOpRequest(String id, InvsLocationTablesObjectDataList noOpIn) {
    super(id, "InvsLocationDetailAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLocationTablesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationDetailAssoc", noOpIn);
      }
      addInput("InvsLocationDetailAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLocationTablesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationTablesObjectDataList getOutput() {
    return InvsLocationTablesObjectHelper.fromMapList(outputMap, "InvsLocationDetailAssocList");
  }
}
