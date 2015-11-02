/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberGetPCRequest.java
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
 * Class used to create a PackageComponentMemberGetPCRequest Udt Request
 *
 */

public class PackageComponentMemberGetPCRequest extends PackageComponentMemberSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentMemberGetPCRequest
 * @param id Unique request name
 * @param PCPCMGetIn PCPCMObjectKeyData for PackageComponentMemberGetPCRequest
 *
 */
@JsonCreator
  public PackageComponentMemberGetPCRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentMember")PCPCMObjectKeyData PCPCMGetIn) {
    super(id, "PackageComponentMemberGetPC");
    if (PCPCMGetIn != null) {
      addInput("PackageComponentMember", PCPCMObjectKeyHelper.toMap(PCPCMGetIn, new HashMap(), "PCPCMObjectKeyData").get("PCPCMObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PCPCMObjectData that results from the PackageComponentMemberGetPCRequest call
 * @return PCPCMObjectData resulting from udt call
 *
 */

  public PCPCMObjectData getOutput() {
    return PCPCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
