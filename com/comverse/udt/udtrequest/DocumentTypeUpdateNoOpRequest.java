/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a DocumentTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class DocumentTypeUpdateNoOpRequest extends DocumentTypeSubRequestParent {
/**
 *
 * Constructor to create a   DocumentTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DocumentTypeUpdateNoOpRequest(String id, DocumentTypeObjectData noOpIn) {
    super(id, "DocumentTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(noOpIn, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }
/**
 *
 * Retrieves the DocumentTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DocumentTypeObjectData getOutput() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
}
