/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GeoAreaSvcGrpMemberUpdateRequest Udt Request
 *
 */

public class GeoAreaSvcGrpMemberUpdateRequest extends GeoAreaSvcGrpMemberSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberUpdateRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpMemberUpdateIn GASGMObjData for GeoAreaSvcGrpMemberUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpMemberUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrpMember")GASGMObjData GeoAreaSvcGrpMemberUpdateIn) {
    super(id, "GeoAreaSvcGrpMemberUpdate");
    if (GeoAreaSvcGrpMemberUpdateIn != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(GeoAreaSvcGrpMemberUpdateIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }

/**
 *
 * Retrieves the GASGMObjData that results from the GeoAreaSvcGrpMemberUpdateRequest call
 * @return GASGMObjData resulting from udt call
 *
 */

  public GASGMObjData getOutput() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
}
