/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcUpdateNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ExternalRcUpdateNoOpRequest Udt Request/Response
 *
 */
public class ExternalRcUpdateNoOpRequest extends ExternalRcSubRequestParent {
/**
 *
 * Constructor to create a   ExternalRcUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalRcUpdateNoOpRequest(String id, ExternalRcObjectData noOpIn) {
    super(id, "ExternalRcUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(noOpIn, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }
/**
 *
 * Retrieves the ExternalRcObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalRcObjectData getOutput() {
    return ExternalRcObjectHelper.fromMap(outputMap, "ExternalRc");
  }
}
