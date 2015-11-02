/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentUpdateRequest.java
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
 * Class used to create a PackageComponentUpdateRequest Udt Request
 *
 */

public class PackageComponentUpdateRequest extends PackageComponentSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentUpdateRequest
 * @param id Unique request name
 * @param PCUpdateIn PCObjectData for PackageComponentUpdateRequest
 * @param PCUpdateFilter PCObjectFilter for PackageComponentUpdateRequest
 * @param PCUpdateGet PCObjectData for PackageComponentUpdateRequest
 *
 */
@JsonCreator
  public PackageComponentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponent")PCObjectData PCUpdateIn, @JsonProperty("PCUpdateFilter")PCObjectFilter PCUpdateFilter, @JsonProperty("PCUpdateGet")PCObjectData PCUpdateGet) {
    super(id, "PackageComponentUpdate");
    if (PCUpdateIn != null) {
      addInput("PackageComponent", PCObjectHelper.toMap(PCUpdateIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
    if (PCUpdateFilter != null) {
      Integer index =  PCUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PCUpdateFilter", PCObjectHelper.toMap(PCUpdateFilter, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
    if (PCUpdateGet != null) {
      addInput("PCUpdateGet", PCObjectHelper.toMap(PCUpdateGet, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }

/**
 *
 * Retrieves the PCObjectData that results from the PackageComponentUpdateRequest call
 * @return PCObjectData resulting from udt call
 *
 */

  public PCObjectData getOutput() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
}
