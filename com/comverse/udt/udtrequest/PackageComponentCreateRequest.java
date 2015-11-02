/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentCreateRequest.java
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
 * Class used to create a PackageComponentCreateRequest Udt Request
 *
 */

public class PackageComponentCreateRequest extends PackageComponentSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentCreateRequest
 * @param id Unique request name
 * @param PCCreateIn PCObjectData for PackageComponentCreateRequest
 *
 */
@JsonCreator
  public PackageComponentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponent")PCObjectData PCCreateIn) {
    super(id, "PackageComponentCreate");
    if (PCCreateIn != null) {
      addInput("PackageComponent", PCObjectHelper.toMap(PCCreateIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }

/**
 *
 * Retrieves the PCObjectData that results from the PackageComponentCreateRequest call
 * @return PCObjectData resulting from udt call
 *
 */

  public PCObjectData getOutput() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
}
