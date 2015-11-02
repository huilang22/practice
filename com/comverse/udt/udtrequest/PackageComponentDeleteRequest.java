/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDeleteRequest.java
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
 * Class used to create a PackageComponentDeleteRequest Udt Request
 *
 */

public class PackageComponentDeleteRequest extends PackageComponentSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentDeleteRequest
 * @param id Unique request name
 * @param PCDeleteIn PCObjectKeyData for PackageComponentDeleteRequest
 *
 */
@JsonCreator
  public PackageComponentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponent")PCObjectKeyData PCDeleteIn) {
    super(id, "PackageComponentDelete");
    if (PCDeleteIn != null) {
      addInput("PackageComponent", PCObjectKeyHelper.toMap(PCDeleteIn, new HashMap(), "PCObjectKeyData").get("PCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PCObjectData that results from the PackageComponentDeleteRequest call
 * @return PCObjectData resulting from udt call
 *
 */

  public PCObjectData getOutput() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
}
