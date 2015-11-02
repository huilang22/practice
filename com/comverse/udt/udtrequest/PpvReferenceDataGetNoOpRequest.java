/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvReferenceDataGetNoOpRequest.java
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
 * NoOp class used to simulate a PpvReferenceDataGetNoOpRequest Udt Request/Response
 *
 */
public class PpvReferenceDataGetNoOpRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a   PpvReferenceDataGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PpvReferenceDataGetNoOpRequest(String id, PpvReferenceDataGetOutputData noOpIn) {
    super(id, "PpvReferenceDataGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PpvReferenceDataGetOutputData", PpvReferenceDataGetOutputHelper.toMap(noOpIn).get("PpvReferenceDataGetOutputData"));
    }
  }
/**
 *
 * Retrieves the PpvReferenceDataGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public PpvReferenceDataGetOutputData getOutput() {
    return PpvReferenceDataGetOutputHelper.fromMap(outputMap);
  }
}
