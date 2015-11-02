/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiUpdateNoOpRequest.java
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
 * NoOp class used to simulate a EpiUpdateNoOpRequest Udt Request/Response
 *
 */
public class EpiUpdateNoOpRequest extends EpiSubRequestParent {
/**
 *
 * Constructor to create a   EpiUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EpiUpdateNoOpRequest(String id, EpiObjectData noOpIn) {
    super(id, "EpiUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Epi", EpiObjectHelper.toMap(noOpIn, new HashMap(), "Epi").get("Epi"));
    }
  }
/**
 *
 * Retrieves the EpiObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EpiObjectData getOutput() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
}
