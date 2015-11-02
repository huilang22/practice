/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdAcctMapGetNoOpRequest.java
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
 * NoOp class used to simulate a ExternalIdAcctMapGetNoOpRequest Udt Request/Response
 *
 */
public class ExternalIdAcctMapGetNoOpRequest extends ExternalIdAcctMapSubRequestParent {
/**
 *
 * Constructor to create a   ExternalIdAcctMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalIdAcctMapGetNoOpRequest(String id, EIAMObjectData noOpIn) {
    super(id, "ExternalIdAcctMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ExternalIdAcctMap", EIAMObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdAcctMap").get("ExternalIdAcctMap"));
    }
  }
/**
 *
 * Retrieves the EIAMObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EIAMObjectData getOutput() {
    return EIAMObjectHelper.fromMap(outputMap, "ExternalIdAcctMap");
  }
}
