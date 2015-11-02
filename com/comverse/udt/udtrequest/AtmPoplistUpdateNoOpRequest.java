/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AtmPoplistUpdateNoOpRequest Udt Request/Response
 *
 */
public class AtmPoplistUpdateNoOpRequest extends AtmPoplistSubRequestParent {
/**
 *
 * Constructor to create a   AtmPoplistUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AtmPoplistUpdateNoOpRequest(String id, AtmPoplistObjectData noOpIn) {
    super(id, "AtmPoplistUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(noOpIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }
/**
 *
 * Retrieves the AtmPoplistObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AtmPoplistObjectData getOutput() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
}
