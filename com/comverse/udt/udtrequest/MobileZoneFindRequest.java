/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a MobileZoneFindRequest Udt Request
 *
 */

public class MobileZoneFindRequest extends MobileZoneRequest {
/**
 *
 * Constructor to create a  MobileZoneFindRequest
 * @param id Unique request name
 * @param MZFindIn MobileZoneObjectFilter for MobileZoneFindRequest
 *
 */
@JsonCreator
  public MobileZoneFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MobileZone")MobileZoneObjectFilter MZFindIn) {
    super(id, "MobileZoneFind");
    if (MZFindIn != null) {
      Integer index =  MZFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MobileZone", MobileZoneObjectHelper.toMap(MZFindIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }

/**
 *
 * Retrieves the MobileZoneObjectDataList that results from the MobileZoneFindRequest call
 * @return MobileZoneObjectDataList resulting from udt call
 *
 */

  public MobileZoneObjectDataList getOutput() {
    return MobileZoneObjectHelper.fromMapList(outputMap, "MobileZoneList");
  }
}
