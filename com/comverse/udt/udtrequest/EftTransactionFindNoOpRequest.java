/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionFindNoOpRequest.java
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
 * NoOp class used to simulate a EftTransactionFindNoOpRequest Udt Request/Response
 *
 */
public class EftTransactionFindNoOpRequest extends EftTransactionRequest {
/**
 *
 * Constructor to create a   EftTransactionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EftTransactionFindNoOpRequest(String id, EftTransactionObjectDataList noOpIn) {
    super(id, "EftTransactionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EftTransactionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EftTransaction", noOpIn);
      }
      addInput("EftTransaction", mapList);
    }
  }
/**
 *
 * Retrieves the EftTransactionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EftTransactionObjectDataList getOutput() {
    return EftTransactionObjectHelper.fromMapList(outputMap, "EftTransactionList");
  }
}
