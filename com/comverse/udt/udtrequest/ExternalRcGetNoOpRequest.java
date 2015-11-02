/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcGetNoOpRequest.java
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
 * NoOp class used to simulate a ExternalRcGetNoOpRequest Udt Request/Response
 *
 */
public class ExternalRcGetNoOpRequest extends ExternalRcSubRequestParent {
/**
 *
 * Constructor to create a   ExternalRcGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalRcGetNoOpRequest(String id, ExternalRcObjectData noOpIn) {
    super(id, "ExternalRcGetNoOpRequest");
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
