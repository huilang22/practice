/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupGetRequest.java
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
 * Class used to create a PackageGroupGetRequest Udt Request
 *
 */

public class PackageGroupGetRequest extends PackageGroupSubRequestParent {
/**
 *
 * Constructor to create a  PackageGroupGetRequest
 * @param id Unique request name
 * @param PGGetIn PGObjectKeyData for PackageGroupGetRequest
 *
 */
@JsonCreator
  public PackageGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageGroup")PGObjectKeyData PGGetIn) {
    super(id, "PackageGroupGet");
    if (PGGetIn != null) {
      addInput("PackageGroup", PGObjectKeyHelper.toMap(PGGetIn, new HashMap(), "PGObjectKeyData").get("PGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PGObjectData that results from the PackageGroupGetRequest call
 * @return PGObjectData resulting from udt call
 *
 */

  public PGObjectData getOutput() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
}
