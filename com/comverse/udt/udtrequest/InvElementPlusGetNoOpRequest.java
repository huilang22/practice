/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusGetNoOpRequest.java
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
 * NoOp class used to simulate a InvElementPlusGetNoOpRequest Udt Request/Response
 *
 */
public class InvElementPlusGetNoOpRequest extends InvElementPlusSubRequestParent {
/**
 *
 * Constructor to create a   InvElementPlusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementPlusGetNoOpRequest(String id, InvElementPlusObjData noOpIn) {
    super(id, "InvElementPlusGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(noOpIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }
/**
 *
 * Retrieves the InvElementPlusObjData passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementPlusObjData getOutput() {
    return InvElementPlusObjHelper.fromMap(outputMap, "InvElementPlus");
  }
}
