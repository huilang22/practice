/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocCreateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaInventoryAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaInventoryAssocCreateNoOpRequest extends GeoAreaInventoryAssocSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaInventoryAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaInventoryAssocCreateNoOpRequest(String id, GeoAreaInventoryAssocObjectData noOpIn) {
    super(id, "GeoAreaInventoryAssocCreateNoOpRequest");
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
