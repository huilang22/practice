/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapCreateNoOpRequest.java
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
 * NoOp class used to simulate a OpenItemIdMapCreateNoOpRequest Udt Request/Response
 *
 */
public class OpenItemIdMapCreateNoOpRequest extends OpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a   OpenItemIdMapCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OpenItemIdMapCreateNoOpRequest(String id, OpenItemIdMapObjectData noOpIn) {
    super(id, "OpenItemIdMapCreateNoOpRequest");
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
