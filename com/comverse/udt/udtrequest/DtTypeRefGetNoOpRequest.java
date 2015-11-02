/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DtTypeRefGetNoOpRequest.java
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
 * NoOp class used to simulate a DtTypeRefGetNoOpRequest Udt Request/Response
 *
 */
public class DtTypeRefGetNoOpRequest extends DocumentTypeRefSubRequestParent {
/**
 *
 * Constructor to create a   DtTypeRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DtTypeRefGetNoOpRequest(String id, DocumentTypeRefObjectData noOpIn) {
    super(id, "DtTypeRefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("DocumentTypeRef", DocumentTypeRefObjectHelper.toMap(noOpIn, new HashMap(), "DocumentTypeRef").get("DocumentTypeRef"));
    }
  }
/**
 *
 * Retrieves the DocumentTypeRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DocumentTypeRefObjectData getOutput() {
    return DocumentTypeRefObjectHelper.fromMap(outputMap, "DocumentTypeRef");
  }
}
