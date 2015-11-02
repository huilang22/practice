/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionGetRequest.java
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
 * Class used to create a PackageDefinitionGetRequest Udt Request
 *
 */

public class PackageDefinitionGetRequest extends PackageDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  PackageDefinitionGetRequest
 * @param id Unique request name
 * @param PDGetIn PDObjectKeyData for PackageDefinitionGetRequest
 *
 */
@JsonCreator
  public PackageDefinitionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageDefinition")PDObjectKeyData PDGetIn) {
    super(id, "PackageDefinitionGet");
    if (PDGetIn != null) {
      addInput("PackageDefinition", PDObjectKeyHelper.toMap(PDGetIn, new HashMap(), "PDObjectKeyData").get("PDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PDObjectData that results from the PackageDefinitionGetRequest call
 * @return PDObjectData resulting from udt call
 *
 */

  public PDObjectData getOutput() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
}
