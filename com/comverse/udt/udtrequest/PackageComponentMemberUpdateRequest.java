/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberUpdateRequest.java
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
 * Class used to create a PackageComponentMemberUpdateRequest Udt Request
 *
 */

public class PackageComponentMemberUpdateRequest extends PackageComponentMemberSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentMemberUpdateRequest
 * @param id Unique request name
 * @param PCMUpdateIn PCMObjectData for PackageComponentMemberUpdateRequest
 * @param PCMUpdateFilter PCMObjectFilter for PackageComponentMemberUpdateRequest
 * @param PCMUpdateGet PCMObjectData for PackageComponentMemberUpdateRequest
 *
 */
@JsonCreator
  public PackageComponentMemberUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentMember")PCMObjectData PCMUpdateIn, @JsonProperty("PCMUpdateFilter")PCMObjectFilter PCMUpdateFilter, @JsonProperty("PCMUpdateGet")PCMObjectData PCMUpdateGet) {
    super(id, "PackageComponentMemberUpdate");
    if (PCMUpdateIn != null) {
      addInput("PackageComponentMember", PCMObjectHelper.toMap(PCMUpdateIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
    if (PCMUpdateFilter != null) {
      Integer index =  PCMUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PCMUpdateFilter", PCMObjectHelper.toMap(PCMUpdateFilter, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
    if (PCMUpdateGet != null) {
      addInput("PCMUpdateGet", PCMObjectHelper.toMap(PCMUpdateGet, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }

/**
 *
 * Retrieves the PCMObjectData that results from the PackageComponentMemberUpdateRequest call
 * @return PCMObjectData resulting from udt call
 *
 */

  public PCMObjectData getOutput() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
