/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneFindRequest.java
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
 * Class used to create a ZoneFindRequest Udt Request
 *
 */

public class ZoneFindRequest extends ZoneRequest {
/**
 *
 * Constructor to create a  ZoneFindRequest
 * @param id Unique request name
 * @param zFindIn ZoneObjectFilter for ZoneFindRequest
 *
 */
@JsonCreator
  public ZoneFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Zone")ZoneObjectFilter zFindIn) {
    super(id, "ZoneFind");
    if (zFindIn != null) {
      Integer index =  zFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Zone", ZoneObjectHelper.toMap(zFindIn, new HashMap(), "Zone").get("Zone"));
    }
  }

/**
 *
 * Retrieves the ZoneObjectDataList that results from the ZoneFindRequest call
 * @return ZoneObjectDataList resulting from udt call
 *
 */

  public ZoneObjectDataList getOutput() {
    return ZoneObjectHelper.fromMapList(outputMap, "ZoneList");
  }
}
