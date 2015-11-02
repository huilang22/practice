/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionCreateRequest.java
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
 * Class used to create a PackageDefinitionCreateRequest Udt Request
 *
 */

public class PackageDefinitionCreateRequest extends PackageDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  PackageDefinitionCreateRequest
 * @param id Unique request name
 * @param PDCreateIn PDObjectData for PackageDefinitionCreateRequest
 *
 */
@JsonCreator
  public PackageDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageDefinition")PDObjectData PDCreateIn) {
    super(id, "PackageDefinitionCreate");
    if (PDCreateIn != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(PDCreateIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }

/**
 *
 * Retrieves the PDObjectData that results from the PackageDefinitionCreateRequest call
 * @return PDObjectData resulting from udt call
 *
 */

  public PDObjectData getOutput() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
}
