/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpUpdateRequest.java
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
 * Class used to create a GeoAreaSvcGrpUpdateRequest Udt Request
 *
 */

public class GeoAreaSvcGrpUpdateRequest extends GeoAreaSvcGrpSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpUpdateRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpUpdateIn GASGObjData for GeoAreaSvcGrpUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrp")GASGObjData GeoAreaSvcGrpUpdateIn) {
    super(id, "GeoAreaSvcGrpUpdate");
    if (GeoAreaSvcGrpUpdateIn != null) {
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(GeoAreaSvcGrpUpdateIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }

/**
 *
 * Retrieves the GASGObjData that results from the GeoAreaSvcGrpUpdateRequest call
 * @return GASGObjData resulting from udt call
 *
 */

  public GASGObjData getOutput() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
}
