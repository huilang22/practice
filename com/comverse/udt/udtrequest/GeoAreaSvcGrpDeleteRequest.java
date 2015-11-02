/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpDeleteRequest.java
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
 * Class used to create a GeoAreaSvcGrpDeleteRequest Udt Request
 *
 */

public class GeoAreaSvcGrpDeleteRequest extends GeoAreaSvcGrpSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpDeleteRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpDeleteIn GASGObjKeyData for GeoAreaSvcGrpDeleteRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrp")GASGObjKeyData GeoAreaSvcGrpDeleteIn) {
    super(id, "GeoAreaSvcGrpDelete");
    if (GeoAreaSvcGrpDeleteIn != null) {
      addInput("GeoAreaSvcGrp", GASGObjKeyHelper.toMap(GeoAreaSvcGrpDeleteIn, new HashMap(), "GASGObjKeyData").get("GASGObjKeyData"));
    }
  }

/**
 *
 * Retrieves the GASGObjData that results from the GeoAreaSvcGrpDeleteRequest call
 * @return GASGObjData resulting from udt call
 *
 */

  public GASGObjData getOutput() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
}
