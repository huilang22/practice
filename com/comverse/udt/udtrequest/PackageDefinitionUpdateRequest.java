/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionUpdateRequest.java
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
 * Class used to create a PackageDefinitionUpdateRequest Udt Request
 *
 */

public class PackageDefinitionUpdateRequest extends PackageDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  PackageDefinitionUpdateRequest
 * @param id Unique request name
 * @param PDUpdateIn PDObjectData for PackageDefinitionUpdateRequest
 *
 */
@JsonCreator
  public PackageDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageDefinition")PDObjectData PDUpdateIn) {
    super(id, "PackageDefinitionUpdate");
    if (PDUpdateIn != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(PDUpdateIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }

/**
 *
 * Retrieves the PDObjectData that results from the PackageDefinitionUpdateRequest call
 * @return PDObjectData resulting from udt call
 *
 */

  public PDObjectData getOutput() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
}
