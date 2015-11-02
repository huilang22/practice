/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a SpecialDestinationTypeGetNoOpRequest Udt Request/Response
 *
 */
public class SpecialDestinationTypeGetNoOpRequest extends SpecialDestinationTypeSubRequestParent {
/**
 *
 * Constructor to create a   SpecialDestinationTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SpecialDestinationTypeGetNoOpRequest(String id, SpecialDestinationTypeObjectData noOpIn) {
    super(id, "SpecialDestinationTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(noOpIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }
/**
 *
 * Retrieves the SpecialDestinationTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SpecialDestinationTypeObjectData getOutput() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
}
