/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupCreateRequest.java
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
 * Class used to create a PackageGroupCreateRequest Udt Request
 *
 */

public class PackageGroupCreateRequest extends PackageGroupSubRequestParent {
/**
 *
 * Constructor to create a  PackageGroupCreateRequest
 * @param id Unique request name
 * @param PGCreateIn PGObjectData for PackageGroupCreateRequest
 *
 */
@JsonCreator
  public PackageGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageGroup")PGObjectData PGCreateIn) {
    super(id, "PackageGroupCreate");
    if (PGCreateIn != null) {
      addInput("PackageGroup", PGObjectHelper.toMap(PGCreateIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }

/**
 *
 * Retrieves the PGObjectData that results from the PackageGroupCreateRequest call
 * @return PGObjectData resulting from udt call
 *
 */

  public PGObjectData getOutput() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
}
