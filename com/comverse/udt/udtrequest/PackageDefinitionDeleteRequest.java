/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionDeleteRequest.java
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
 * Class used to create a PackageDefinitionDeleteRequest Udt Request
 *
 */

public class PackageDefinitionDeleteRequest extends PackageDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  PackageDefinitionDeleteRequest
 * @param id Unique request name
 * @param PDDeleteIn PDObjectKeyData for PackageDefinitionDeleteRequest
 *
 */
@JsonCreator
  public PackageDefinitionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageDefinition")PDObjectKeyData PDDeleteIn) {
    super(id, "PackageDefinitionDelete");
    if (PDDeleteIn != null) {
      addInput("PackageDefinition", PDObjectKeyHelper.toMap(PDDeleteIn, new HashMap(), "PDObjectKeyData").get("PDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PDObjectData that results from the PackageDefinitionDeleteRequest call
 * @return PDObjectData resulting from udt call
 *
 */

  public PDObjectData getOutput() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
}
