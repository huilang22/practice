/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocUpdateNoOpRequest.java
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

import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaInventoryAssocUpdateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaInventoryAssocUpdateNoOpRequest extends GeoAreaInventoryAssocSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaInventoryAssocUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaInventoryAssocUpdateNoOpRequest(String id, GeoAreaInventoryAssocObjectData noOpIn) {
    super(id, "GeoAreaInventoryAssocUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }
/**
 *
 * Retrieves the GeoAreaInventoryAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaInventoryAssocObjectData getOutput() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
}
