/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAutoAssociateNoOpRequest.java
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

import com.csgsystems.iv.data.*;
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaInventoryAutoAssociateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaInventoryAutoAssociateNoOpRequest extends InvAutoAssocSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaInventoryAutoAssociateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaInventoryAutoAssociateNoOpRequest(String id, GeoAreaInventoryAutoAssociateOutputData noOpIn) {
    super(id, "GeoAreaInventoryAutoAssociateNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaInventoryAutoAssociateOutputData", GeoAreaInventoryAutoAssociateOutputHelper.toMap(noOpIn).get("GeoAreaInventoryAutoAssociateOutputData"));
    }
  }
/**
 *
 * Retrieves the GeoAreaInventoryAutoAssociateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaInventoryAutoAssociateOutputData getOutput() {
    return GeoAreaInventoryAutoAssociateOutputHelper.fromMap(outputMap);
  }
}
