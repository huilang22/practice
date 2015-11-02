/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a DocumentTypeFindNoOpRequest Udt Request/Response
 *
 */
public class DocumentTypeFindNoOpRequest extends DocumentTypeRequest {
/**
 *
 * Constructor to create a   DocumentTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DocumentTypeFindNoOpRequest(String id, DocumentTypeObjectDataList noOpIn) {
    super(id, "DocumentTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DocumentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DocumentType", noOpIn);
      }
      addInput("DocumentType", mapList);
    }
  }
/**
 *
 * Retrieves the DocumentTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DocumentTypeObjectDataList getOutput() {
    return DocumentTypeObjectHelper.fromMapList(outputMap, "DocumentTypeList");
  }
}
