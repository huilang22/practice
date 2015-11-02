/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassCreateRequest.java
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
 * Class used to create a ZoneClassCreateRequest Udt Request
 *
 */

public class ZoneClassCreateRequest extends ZoneClassSubRequestParent {
/**
 *
 * Constructor to create a  ZoneClassCreateRequest
 * @param id Unique request name
 * @param zcCrIn ZoneClassObjectData for ZoneClassCreateRequest
 *
 */
@JsonCreator
  public ZoneClassCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ZoneClass")ZoneClassObjectData zcCrIn) {
    super(id, "ZoneClassCreate");
    if (zcCrIn != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(zcCrIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }

/**
 *
 * Retrieves the ZoneClassObjectData that results from the ZoneClassCreateRequest call
 * @return ZoneClassObjectData resulting from udt call
 *
 */

  public ZoneClassObjectData getOutput() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
}
