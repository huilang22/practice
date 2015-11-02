/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassFindRequest.java
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
 * Class used to create a ZoneClassFindRequest Udt Request
 *
 */

public class ZoneClassFindRequest extends ZoneClassRequest {
/**
 *
 * Constructor to create a  ZoneClassFindRequest
 * @param id Unique request name
 * @param zcFindIn ZoneClassObjectFilter for ZoneClassFindRequest
 *
 */
@JsonCreator
  public ZoneClassFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ZoneClass")ZoneClassObjectFilter zcFindIn) {
    super(id, "ZoneClassFind");
    if (zcFindIn != null) {
      Integer index =  zcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(zcFindIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }

/**
 *
 * Retrieves the ZoneClassObjectDataList that results from the ZoneClassFindRequest call
 * @return ZoneClassObjectDataList resulting from udt call
 *
 */

  public ZoneClassObjectDataList getOutput() {
    return ZoneClassObjectHelper.fromMapList(outputMap, "ZoneClassList");
  }
}
