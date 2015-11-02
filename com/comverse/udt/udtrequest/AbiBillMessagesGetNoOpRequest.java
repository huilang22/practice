/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesGetNoOpRequest.java
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
 * NoOp class used to simulate a AbiBillMessagesGetNoOpRequest Udt Request/Response
 *
 */
public class AbiBillMessagesGetNoOpRequest extends AbiBillMessagesSubRequestParent {
/**
 *
 * Constructor to create a   AbiBillMessagesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiBillMessagesGetNoOpRequest(String id, AbiBillMessagesObjectData noOpIn) {
    super(id, "AbiBillMessagesGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(noOpIn, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }
/**
 *
 * Retrieves the AbiBillMessagesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillMessagesObjectData getOutput() {
    return AbiBillMessagesObjectHelper.fromMap(outputMap, "AbiBillMessages");
  }
}
