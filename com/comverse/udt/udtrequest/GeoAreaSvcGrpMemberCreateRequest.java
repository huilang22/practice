/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberCreateRequest.java
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
 * Class used to create a GeoAreaSvcGrpMemberCreateRequest Udt Request
 *
 */

public class GeoAreaSvcGrpMemberCreateRequest extends GeoAreaSvcGrpMemberSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberCreateRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpMemberCreateIn GASGMObjData for GeoAreaSvcGrpMemberCreateRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpMemberCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrpMember")GASGMObjData GeoAreaSvcGrpMemberCreateIn) {
    super(id, "GeoAreaSvcGrpMemberCreate");
    if (GeoAreaSvcGrpMemberCreateIn != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(GeoAreaSvcGrpMemberCreateIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }

/**
 *
 * Retrieves the GASGMObjData that results from the GeoAreaSvcGrpMemberCreateRequest call
 * @return GASGMObjData resulting from udt call
 *
 */

  public GASGMObjData getOutput() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
}
