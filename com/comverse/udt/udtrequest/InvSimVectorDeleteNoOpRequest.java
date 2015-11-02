/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorDeleteNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvSimVectorDeleteNoOpRequest Udt Request/Response
 *
 */
public class InvSimVectorDeleteNoOpRequest extends InvSimVectorSubRequestParent {
/**
 *
 * Constructor to create a   InvSimVectorDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSimVectorDeleteNoOpRequest(String id, InvSimVectorDeleteObjData noOpIn) {
    super(id, "InvSimVectorDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("InvSimVector", InvSimVectorDeleteObjHelper.toMap(noOpIn, new HashMap(), "InvSimVector").get("InvSimVector"));
    }
  }
/**
 *
 * Retrieves the InvSimVectorDeleteObjData passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimVectorDeleteObjData getOutput() {
    return InvSimVectorDeleteObjHelper.fromMap(outputMap, "InvSimVector");
  }
}
