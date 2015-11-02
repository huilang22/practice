/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapDeleteNoOpRequest.java
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
 * NoOp class used to simulate a OpenItemIdMapDeleteNoOpRequest Udt Request/Response
 *
 */
public class OpenItemIdMapDeleteNoOpRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a   OpenItemIdMapDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OpenItemIdMapDeleteNoOpRequest(String id, OpenItemIdMapObjectData noOpIn) {
    super(id, "OpenItemIdMapDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(noOpIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
/**
 *
 * Retrieves the OpenItemIdMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemIdMapObjectData getOutput() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
}
