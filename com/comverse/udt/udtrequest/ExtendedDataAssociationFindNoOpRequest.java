/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationFindNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataAssociationFindNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataAssociationFindNoOpRequest extends ExtendedDataAssociationRequest {
/**
 *
 * Constructor to create a   ExtendedDataAssociationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataAssociationFindNoOpRequest(String id, ExtendedDataObjectDataList noOpIn) {
    super(id, "ExtendedDataAssociationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ExtendedDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataAssociation", noOpIn);
      }
      addInput("ExtendedDataAssociation", mapList);
    }
  }
/**
 *
 * Retrieves the ExtendedDataObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataObjectDataList getOutput() {
    return ExtendedDataObjectHelper.fromMapList(outputMap, "ExtendedDataAssociationList");
  }
}
