/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerGetNoOpRequest.java
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
 * NoOp class used to simulate a TicklerGetNoOpRequest Udt Request/Response
 *
 */
public class TicklerGetNoOpRequest extends TicklerSubRequestParent {
/**
 *
 * Constructor to create a   TicklerGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TicklerGetNoOpRequest(String id, TicklerObjectData noOpIn) {
    super(id, "TicklerGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Tickler", TicklerObjectHelper.toMap(noOpIn, new HashMap(), "Tickler").get("Tickler"));
    }
  }
/**
 *
 * Retrieves the TicklerObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TicklerObjectData getOutput() {
    return TicklerObjectHelper.fromMap(outputMap, "Tickler");
  }
}
