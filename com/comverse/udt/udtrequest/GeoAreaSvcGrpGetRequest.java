/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpGetRequest.java
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
 * Class used to create a GeoAreaSvcGrpGetRequest Udt Request
 *
 */

public class GeoAreaSvcGrpGetRequest extends GeoAreaSvcGrpSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpGetRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpGetIn GASGObjKeyData for GeoAreaSvcGrpGetRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrp")GASGObjKeyData GeoAreaSvcGrpGetIn) {
    super(id, "GeoAreaSvcGrpGet");
    if (GeoAreaSvcGrpGetIn != null) {
      addInput("GeoAreaSvcGrp", GASGObjKeyHelper.toMap(GeoAreaSvcGrpGetIn, new HashMap(), "GASGObjKeyData").get("GASGObjKeyData"));
    }
  }

/**
 *
 * Retrieves the GASGObjData that results from the GeoAreaSvcGrpGetRequest call
 * @return GASGObjData resulting from udt call
 *
 */

  public GASGObjData getOutput() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
}
