/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassCreateNoOpRequest.java
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
 * NoOp class used to simulate a ZoneClassCreateNoOpRequest Udt Request/Response
 *
 */
public class ZoneClassCreateNoOpRequest extends ZoneClassSubRequestParent {
/**
 *
 * Constructor to create a   ZoneClassCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ZoneClassCreateNoOpRequest(String id, ZoneClassObjectData noOpIn) {
    super(id, "ZoneClassCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(noOpIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }
/**
 *
 * Retrieves the ZoneClassObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneClassObjectData getOutput() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
}
