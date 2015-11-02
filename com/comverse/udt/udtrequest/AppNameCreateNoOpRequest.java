/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameCreateNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a AppNameCreateNoOpRequest Udt Request/Response
 *
 */
public class AppNameCreateNoOpRequest extends AppNameSubRequestParent {
/**
 *
 * Constructor to create a   AppNameCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AppNameCreateNoOpRequest(String id, AppNameObjectData noOpIn) {
    super(id, "AppNameCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AppName", AppNameObjectHelper.toMap(noOpIn, new HashMap(), "AppName").get("AppName"));
    }
  }
/**
 *
 * Retrieves the AppNameObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AppNameObjectData getOutput() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
}
