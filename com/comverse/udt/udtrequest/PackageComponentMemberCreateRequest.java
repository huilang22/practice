/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberCreateRequest.java
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
 * Class used to create a PackageComponentMemberCreateRequest Udt Request
 *
 */

public class PackageComponentMemberCreateRequest extends PackageComponentMemberSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentMemberCreateRequest
 * @param id Unique request name
 * @param PCMCreateIn PCMObjectData for PackageComponentMemberCreateRequest
 *
 */
@JsonCreator
  public PackageComponentMemberCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentMember")PCMObjectData PCMCreateIn) {
    super(id, "PackageComponentMemberCreate");
    if (PCMCreateIn != null) {
      addInput("PackageComponentMember", PCMObjectHelper.toMap(PCMCreateIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }

/**
 *
 * Retrieves the PCMObjectData that results from the PackageComponentMemberCreateRequest call
 * @return PCMObjectData resulting from udt call
 *
 */

  public PCMObjectData getOutput() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
