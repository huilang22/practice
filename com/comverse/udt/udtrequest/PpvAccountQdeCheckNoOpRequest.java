/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvAccountQdeCheckNoOpRequest.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a PpvAccountQdeCheckNoOpRequest Udt Request/Response
 *
 */
public class PpvAccountQdeCheckNoOpRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a   PpvAccountQdeCheckNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PpvAccountQdeCheckNoOpRequest(String id, PpvAccountObjectData noOpIn) {
    super(id, "PpvAccountQdeCheckNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountOut", PpvAccountObjectHelper.toMap(noOpIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }
/**
 *
 * Retrieves the PpvAccountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PpvAccountObjectData getOutput() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
}
