/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupUpdateRequest.java
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
 * Class used to create a PackageGroupUpdateRequest Udt Request
 *
 */

public class PackageGroupUpdateRequest extends PackageGroupSubRequestParent {
/**
 *
 * Constructor to create a  PackageGroupUpdateRequest
 * @param id Unique request name
 * @param PGUpdateIn PGObjectData for PackageGroupUpdateRequest
 *
 */
@JsonCreator
  public PackageGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageGroup")PGObjectData PGUpdateIn) {
    super(id, "PackageGroupUpdate");
    if (PGUpdateIn != null) {
      addInput("PackageGroup", PGObjectHelper.toMap(PGUpdateIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }

/**
 *
 * Retrieves the PGObjectData that results from the PackageGroupUpdateRequest call
 * @return PGObjectData resulting from udt call
 *
 */

  public PGObjectData getOutput() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
}
