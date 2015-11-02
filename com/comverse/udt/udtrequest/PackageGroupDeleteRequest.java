/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupDeleteRequest.java
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
 * Class used to create a PackageGroupDeleteRequest Udt Request
 *
 */

public class PackageGroupDeleteRequest extends PackageGroupSubRequestParent {
/**
 *
 * Constructor to create a  PackageGroupDeleteRequest
 * @param id Unique request name
 * @param PGDeleteIn PGObjectKeyData for PackageGroupDeleteRequest
 *
 */
@JsonCreator
  public PackageGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageGroup")PGObjectKeyData PGDeleteIn) {
    super(id, "PackageGroupDelete");
    if (PGDeleteIn != null) {
      addInput("PackageGroup", PGObjectKeyHelper.toMap(PGDeleteIn, new HashMap(), "PGObjectKeyData").get("PGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PGObjectData that results from the PackageGroupDeleteRequest call
 * @return PGObjectData resulting from udt call
 *
 */

  public PGObjectData getOutput() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
}
