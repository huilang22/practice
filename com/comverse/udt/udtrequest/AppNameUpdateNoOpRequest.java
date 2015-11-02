/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AppNameUpdateNoOpRequest Udt Request/Response
 *
 */
public class AppNameUpdateNoOpRequest extends AppNameSubRequestParent {
/**
 *
 * Constructor to create a   AppNameUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AppNameUpdateNoOpRequest(String id, AppNameObjectData noOpIn) {
    super(id, "AppNameUpdateNoOpRequest");
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
