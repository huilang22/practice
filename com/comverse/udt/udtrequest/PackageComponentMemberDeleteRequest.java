/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberDeleteRequest.java
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
 * Class used to create a PackageComponentMemberDeleteRequest Udt Request
 *
 */

public class PackageComponentMemberDeleteRequest extends PackageComponentMemberSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentMemberDeleteRequest
 * @param id Unique request name
 * @param PCMDeleteIn PCMObjectKeyData for PackageComponentMemberDeleteRequest
 *
 */
@JsonCreator
  public PackageComponentMemberDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentMember")PCMObjectKeyData PCMDeleteIn) {
    super(id, "PackageComponentMemberDelete");
    if (PCMDeleteIn != null) {
      addInput("PackageComponentMember", PCMObjectKeyHelper.toMap(PCMDeleteIn, new HashMap(), "PCMObjectKeyData").get("PCMObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PCMObjectData that results from the PackageComponentMemberDeleteRequest call
 * @return PCMObjectData resulting from udt call
 *
 */

  public PCMObjectData getOutput() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
