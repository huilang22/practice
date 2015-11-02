/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTemplateTypeFindNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchTemplateTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BatchTemplateTypeFindNoOpRequest extends BatchTemplateTypeRequest {
/**
 *
 * Constructor to create a   BatchTemplateTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTemplateTypeFindNoOpRequest(String id, BatchTemplateTypeObjectDataList noOpIn) {
    super(id, "BatchTemplateTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchTemplateTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchTemplateType", noOpIn);
      }
      addInput("BatchTemplateType", mapList);
    }
  }
/**
 *
 * Retrieves the BatchTemplateTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTemplateTypeObjectDataList getOutput() {
    return BatchTemplateTypeObjectHelper.fromMapList(outputMap, "BatchTemplateTypeList");
  }
}
