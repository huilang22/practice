/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrGetNoOpRequest.java
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
 * NoOp class used to simulate a NrcTransDescrGetNoOpRequest Udt Request/Response
 *
 */
public class NrcTransDescrGetNoOpRequest extends NrcTransDescrSubRequestParent {
/**
 *
 * Constructor to create a   NrcTransDescrGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTransDescrGetNoOpRequest(String id, NrcTransDescrObjectData noOpIn) {
    super(id, "NrcTransDescrGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(noOpIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
/**
 *
 * Retrieves the NrcTransDescrObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrObjectData getOutput() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
  }
}
