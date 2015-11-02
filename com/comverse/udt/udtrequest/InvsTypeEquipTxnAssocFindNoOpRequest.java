/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsTypeEquipTxnAssocFindNoOpRequest Udt Request/Response
 *
 */
public class InvsTypeEquipTxnAssocFindNoOpRequest extends InvsTypeEquipTxnAssocRequest {
/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocFindNoOpRequest(String id, InvsTypeEquipTxnTablesObjectDataList noOpIn) {
    super(id, "InvsTypeEquipTxnAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsTypeEquipTxnTablesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsTypeEquipTxnAssoc", noOpIn);
      }
      addInput("InvsTypeEquipTxnAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the InvsTypeEquipTxnTablesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeEquipTxnTablesObjectDataList getOutput() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMapList(outputMap, "InvsTypeEquipTxnAssocList");
  }
}
