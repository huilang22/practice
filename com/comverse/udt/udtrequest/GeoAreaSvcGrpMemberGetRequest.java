/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberGetRequest.java
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
 * Class used to create a GeoAreaSvcGrpMemberGetRequest Udt Request
 *
 */

public class GeoAreaSvcGrpMemberGetRequest extends GeoAreaSvcGrpMemberSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberGetRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpMemberGetIn GASGMObjKeyData for GeoAreaSvcGrpMemberGetRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpMemberGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrpMember")GASGMObjKeyData GeoAreaSvcGrpMemberGetIn) {
    super(id, "GeoAreaSvcGrpMemberGet");
    if (GeoAreaSvcGrpMemberGetIn != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjKeyHelper.toMap(GeoAreaSvcGrpMemberGetIn, new HashMap(), "GASGMObjKeyData").get("GASGMObjKeyData"));
    }
  }

/**
 *
 * Retrieves the GASGMObjData that results from the GeoAreaSvcGrpMemberGetRequest call
 * @return GASGMObjData resulting from udt call
 *
 */

  public GASGMObjData getOutput() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
}
