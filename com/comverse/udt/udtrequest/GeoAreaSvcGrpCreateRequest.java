/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpCreateRequest.java
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
 * Class used to create a GeoAreaSvcGrpCreateRequest Udt Request
 *
 */

public class GeoAreaSvcGrpCreateRequest extends GeoAreaSvcGrpSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpCreateRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpCreateIn GASGObjData for GeoAreaSvcGrpCreateRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrp")GASGObjData GeoAreaSvcGrpCreateIn) {
    super(id, "GeoAreaSvcGrpCreate");
    if (GeoAreaSvcGrpCreateIn != null) {
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(GeoAreaSvcGrpCreateIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }

/**
 *
 * Retrieves the GASGObjData that results from the GeoAreaSvcGrpCreateRequest call
 * @return GASGObjData resulting from udt call
 *
 */

  public GASGObjData getOutput() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
}
