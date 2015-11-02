/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberFindRequest.java
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
 * Class used to create a GeoAreaSvcGrpMemberFindRequest Udt Request
 *
 */

public class GeoAreaSvcGrpMemberFindRequest extends GeoAreaSvcGrpMemberRequest {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberFindRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpMemberFindIn GASGMObjFilter for GeoAreaSvcGrpMemberFindRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpMemberFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrpMember")GASGMObjFilter GeoAreaSvcGrpMemberFindIn) {
    super(id, "GeoAreaSvcGrpMemberFind");
    if (GeoAreaSvcGrpMemberFindIn != null) {
      Integer index =  GeoAreaSvcGrpMemberFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(GeoAreaSvcGrpMemberFindIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }

/**
 *
 * Retrieves the GASGMObjDataList that results from the GeoAreaSvcGrpMemberFindRequest call
 * @return GASGMObjDataList resulting from udt call
 *
 */

  public GASGMObjDataList getOutput() {
    return GASGMObjHelper.fromMapList(outputMap, "GeoAreaSvcGrpMemberList");
  }
}
