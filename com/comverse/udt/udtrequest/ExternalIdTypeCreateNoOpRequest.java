/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a ExternalIdTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class ExternalIdTypeCreateNoOpRequest extends ExternalIdTypeSubRequestParent {
/**
 *
 * Constructor to create a   ExternalIdTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalIdTypeCreateNoOpRequest(String id, ExternalIdTypeObjectData noOpIn) {
    super(id, "ExternalIdTypeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
/**
 *
 * Retrieves the ExternalIdTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalIdTypeObjectData getOutput() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
}
