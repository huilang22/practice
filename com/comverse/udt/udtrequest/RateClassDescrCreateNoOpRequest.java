/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrCreateNoOpRequest.java
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
 * NoOp class used to simulate a RateClassDescrCreateNoOpRequest Udt Request/Response
 *
 */
public class RateClassDescrCreateNoOpRequest extends RateClassDescrSubRequestParent {
/**
 *
 * Constructor to create a   RateClassDescrCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateClassDescrCreateNoOpRequest(String id, RateClassDescrObjectData noOpIn) {
    super(id, "RateClassDescrCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(noOpIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }
/**
 *
 * Retrieves the RateClassDescrObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateClassDescrObjectData getOutput() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
}
