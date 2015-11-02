/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberGetRequest.java
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
 * Class used to create a PackageComponentMemberGetRequest Udt Request
 *
 */

public class PackageComponentMemberGetRequest extends PackageComponentMemberSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentMemberGetRequest
 * @param id Unique request name
 * @param PCMGetIn PCMObjectKeyData for PackageComponentMemberGetRequest
 *
 */
@JsonCreator
  public PackageComponentMemberGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentMember")PCMObjectKeyData PCMGetIn) {
    super(id, "PackageComponentMemberGet");
    if (PCMGetIn != null) {
      addInput("PackageComponentMember", PCMObjectKeyHelper.toMap(PCMGetIn, new HashMap(), "PCMObjectKeyData").get("PCMObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PCMObjectData that results from the PackageComponentMemberGetRequest call
 * @return PCMObjectData resulting from udt call
 *
 */

  public PCMObjectData getOutput() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
