/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonUpdateNoOpRequest.java
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
 * NoOp class used to simulate a DiscReasonUpdateNoOpRequest Udt Request/Response
 *
 */
public class DiscReasonUpdateNoOpRequest extends DiscReasonSubRequestParent {
/**
 *
 * Constructor to create a   DiscReasonUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscReasonUpdateNoOpRequest(String id, DiscReasonObjectData noOpIn) {
    super(id, "DiscReasonUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(noOpIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }
/**
 *
 * Retrieves the DiscReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DiscReasonObjectData getOutput() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
}
