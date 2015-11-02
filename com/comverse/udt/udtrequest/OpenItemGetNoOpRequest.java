/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a OpenItemGetNoOpRequest Udt Request/Response
 *
 */
public class OpenItemGetNoOpRequest extends OpenItemSubRequestParent {
/**
 *
 * Constructor to create a   OpenItemGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OpenItemGetNoOpRequest(String id, OpenItemObjectData noOpIn) {
    super(id, "OpenItemGetNoOpRequest");
    if (noOpIn != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(noOpIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }
/**
 *
 * Retrieves the OpenItemObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemObjectData getOutput() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
}
