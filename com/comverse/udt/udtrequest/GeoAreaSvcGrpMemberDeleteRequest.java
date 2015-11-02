/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberDeleteRequest.java
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
 * Class used to create a GeoAreaSvcGrpMemberDeleteRequest Udt Request
 *
 */

public class GeoAreaSvcGrpMemberDeleteRequest extends GeoAreaSvcGrpMemberSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberDeleteRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpMemberDeleteIn GASGMObjKeyData for GeoAreaSvcGrpMemberDeleteRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpMemberDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrpMember")GASGMObjKeyData GeoAreaSvcGrpMemberDeleteIn) {
    super(id, "GeoAreaSvcGrpMemberDelete");
    if (GeoAreaSvcGrpMemberDeleteIn != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjKeyHelper.toMap(GeoAreaSvcGrpMemberDeleteIn, new HashMap(), "GASGMObjKeyData").get("GASGMObjKeyData"));
    }
  }

/**
 *
 * Retrieves the GASGMObjData that results from the GeoAreaSvcGrpMemberDeleteRequest call
 * @return GASGMObjData resulting from udt call
 *
 */

  public GASGMObjData getOutput() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
}
