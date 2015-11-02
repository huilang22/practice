/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpMemberUpdateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaSvcGrpMemberUpdateNoOpRequest extends GeoAreaSvcGrpMemberSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaSvcGrpMemberUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaSvcGrpMemberUpdateNoOpRequest(String id, GASGMObjData noOpIn) {
    super(id, "GeoAreaSvcGrpMemberUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(noOpIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }
/**
 *
 * Retrieves the GASGMObjData passed into the constructor
 * @return Simulated response
 *
 */
  public GASGMObjData getOutput() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
}
