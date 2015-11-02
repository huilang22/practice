/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentCreateNoOpRequest.java
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
 * NoOp class used to simulate a CustomerDocumentCreateNoOpRequest Udt Request/Response
 *
 */
public class CustomerDocumentCreateNoOpRequest extends CustomerDocumentSubRequestParent {
/**
 *
 * Constructor to create a   CustomerDocumentCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerDocumentCreateNoOpRequest(String id, CustomerDocumentObjectData noOpIn) {
    super(id, "CustomerDocumentCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(noOpIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }
/**
 *
 * Retrieves the CustomerDocumentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDocumentObjectData getOutput() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
}
