/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestTemplateDefinitionFindNoOpRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionFindNoOpRequest(String id, BatchRequestTemplateDefinitionObjectDataList noOpIn) {
    super(id, "BatchRequestTemplateDefinitionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestTemplateDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestTemplateDefinition", noOpIn);
      }
      addInput("BatchRequestTemplateDefinition", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestTemplateDefinitionObjectDataList getOutput() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestTemplateDefinitionList");
  }
}
