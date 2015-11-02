/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentGetRequest.java
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
 * Class used to create a PackageComponentGetRequest Udt Request
 *
 */

public class PackageComponentGetRequest extends PackageComponentSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentGetRequest
 * @param id Unique request name
 * @param PCGetIn PCObjectKeyData for PackageComponentGetRequest
 *
 */
@JsonCreator
  public PackageComponentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponent")PCObjectKeyData PCGetIn) {
    super(id, "PackageComponentGet");
    if (PCGetIn != null) {
      addInput("PackageComponent", PCObjectKeyHelper.toMap(PCGetIn, new HashMap(), "PCObjectKeyData").get("PCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PCObjectData that results from the PackageComponentGetRequest call
 * @return PCObjectData resulting from udt call
 *
 */

  public PCObjectData getOutput() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
}
