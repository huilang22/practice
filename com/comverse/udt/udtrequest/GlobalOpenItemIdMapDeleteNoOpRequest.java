/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapDeleteNoOpRequest.java
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
 * NoOp class used to simulate a GlobalOpenItemIdMapDeleteNoOpRequest Udt Request/Response
 *
 */
public class GlobalOpenItemIdMapDeleteNoOpRequest extends GlobalOpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a   GlobalOpenItemIdMapDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalOpenItemIdMapDeleteNoOpRequest(String id, GlobalOpenItemIdMapObjectData noOpIn) {
    super(id, "GlobalOpenItemIdMapDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(noOpIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalOpenItemIdMapObjectData getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
}
