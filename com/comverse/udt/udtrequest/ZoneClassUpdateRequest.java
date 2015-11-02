/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassUpdateRequest.java
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
 * Class used to create a ZoneClassUpdateRequest Udt Request
 *
 */

public class ZoneClassUpdateRequest extends ZoneClassSubRequestParent {
/**
 *
 * Constructor to create a  ZoneClassUpdateRequest
 * @param id Unique request name
 * @param zcUpdIn ZoneClassObjectData for ZoneClassUpdateRequest
 *
 */
@JsonCreator
  public ZoneClassUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ZoneClass")ZoneClassObjectData zcUpdIn) {
    super(id, "ZoneClassUpdate");
    if (zcUpdIn != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(zcUpdIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }

/**
 *
 * Retrieves the ZoneClassObjectData that results from the ZoneClassUpdateRequest call
 * @return ZoneClassObjectData resulting from udt call
 *
 */

  public ZoneClassObjectData getOutput() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
}
