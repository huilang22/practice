/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrUpdateNoOpRequest.java
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
 * NoOp class used to simulate a NrcTransDescrUpdateNoOpRequest Udt Request/Response
 *
 */
public class NrcTransDescrUpdateNoOpRequest extends NrcTransDescrSubRequestParent {
/**
 *
 * Constructor to create a   NrcTransDescrUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTransDescrUpdateNoOpRequest(String id, NrcTransDescrObjectData noOpIn) {
    super(id, "NrcTransDescrUpdateNoOpRequest");
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
