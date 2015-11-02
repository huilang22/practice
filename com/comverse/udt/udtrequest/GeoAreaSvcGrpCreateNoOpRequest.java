/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpCreateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpCreateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaSvcGrpCreateNoOpRequest extends GeoAreaSvcGrpSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaSvcGrpCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaSvcGrpCreateNoOpRequest(String id, GASGObjData noOpIn) {
    super(id, "GeoAreaSvcGrpCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(noOpIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
/**
 *
 * Retrieves the GASGObjData passed into the constructor
 * @return Simulated response
 *
 */
  public GASGObjData getOutput() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
}
