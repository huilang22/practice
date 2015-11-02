/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocCreateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaAddressAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaAddressAssocCreateNoOpRequest extends GeoAreaAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaAddressAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaAddressAssocCreateNoOpRequest(String id, GeoAreaAddressAssocObjectData noOpIn) {
    super(id, "GeoAreaAddressAssocCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }
/**
 *
 * Retrieves the GeoAreaAddressAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaAddressAssocObjectData getOutput() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
}
