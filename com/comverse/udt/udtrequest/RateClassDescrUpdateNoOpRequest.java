/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateClassDescrUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateClassDescrUpdateNoOpRequest extends RateClassDescrSubRequestParent {
/**
 *
 * Constructor to create a   RateClassDescrUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateClassDescrUpdateNoOpRequest(String id, RateClassDescrObjectData noOpIn) {
    super(id, "RateClassDescrUpdateNoOpRequest");
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
