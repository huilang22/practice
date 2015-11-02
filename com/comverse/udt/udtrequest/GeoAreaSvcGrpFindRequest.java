/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpFindRequest.java
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
 * Class used to create a GeoAreaSvcGrpFindRequest Udt Request
 *
 */

public class GeoAreaSvcGrpFindRequest extends GeoAreaSvcGrpRequest {
/**
 *
 * Constructor to create a  GeoAreaSvcGrpFindRequest
 * @param id Unique request name
 * @param GeoAreaSvcGrpFindIn GASGObjFilter for GeoAreaSvcGrpFindRequest
 *
 */
@JsonCreator
  public GeoAreaSvcGrpFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaSvcGrp")GASGObjFilter GeoAreaSvcGrpFindIn) {
    super(id, "GeoAreaSvcGrpFind");
    if (GeoAreaSvcGrpFindIn != null) {
      Integer index =  GeoAreaSvcGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(GeoAreaSvcGrpFindIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }

/**
 *
 * Retrieves the GASGObjDataList that results from the GeoAreaSvcGrpFindRequest call
 * @return GASGObjDataList resulting from udt call
 *
 */

  public GASGObjDataList getOutput() {
    return GASGObjHelper.fromMapList(outputMap, "GeoAreaSvcGrpList");
  }
}
