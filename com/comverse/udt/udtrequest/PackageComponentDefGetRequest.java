/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PackageComponentDefGetRequest Udt Request
 *
 */

public class PackageComponentDefGetRequest extends PackageComponentDefSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentDefGetRequest
 * @param id Unique request name
 * @param PCDGetIn PCDObjectKeyData for PackageComponentDefGetRequest
 *
 */
@JsonCreator
  public PackageComponentDefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentDef")PCDObjectKeyData PCDGetIn) {
    super(id, "PackageComponentDefGet");
    if (PCDGetIn != null) {
      addInput("PackageComponentDef", PCDObjectKeyHelper.toMap(PCDGetIn, new HashMap(), "PCDObjectKeyData").get("PCDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PCDObjectData that results from the PackageComponentDefGetRequest call
 * @return PCDObjectData resulting from udt call
 *
 */

  public PCDObjectData getOutput() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDef");
  }
}
