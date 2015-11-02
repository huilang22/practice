/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a DocumentTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class DocumentTypeCreateNoOpRequest extends DocumentTypeSubRequestParent {
/**
 *
 * Constructor to create a   DocumentTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DocumentTypeCreateNoOpRequest(String id, DocumentTypeObjectData noOpIn) {
    super(id, "DocumentTypeCreateNoOpRequest");
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
