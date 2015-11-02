/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpUpdateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaSvcGrpUpdateNoOpRequest extends GeoAreaSvcGrpSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaSvcGrpUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaSvcGrpUpdateNoOpRequest(String id, GASGObjData noOpIn) {
    super(id, "GeoAreaSvcGrpUpdateNoOpRequest");
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
