/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonGetNoOpRequest.java
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
 * NoOp class used to simulate a ConnectReasonGetNoOpRequest Udt Request/Response
 *
 */
public class ConnectReasonGetNoOpRequest extends ConnectReasonSubRequestParent {
/**
 *
 * Constructor to create a   ConnectReasonGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConnectReasonGetNoOpRequest(String id, ConnectReasonObjectData noOpIn) {
    super(id, "ConnectReasonGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(noOpIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }
/**
 *
 * Retrieves the ConnectReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ConnectReasonObjectData getOutput() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
}
