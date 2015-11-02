/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemDeleteNoOpRequest.java
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
 * NoOp class used to simulate a OpenItemDeleteNoOpRequest Udt Request/Response
 *
 */
public class OpenItemDeleteNoOpRequest extends OpenItemSubRequestParent {
/**
 *
 * Constructor to create a   OpenItemDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OpenItemDeleteNoOpRequest(String id, OpenItemObjectData noOpIn) {
    super(id, "OpenItemDeleteNoOpRequest");
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
