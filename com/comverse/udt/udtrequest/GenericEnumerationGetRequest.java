/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationGetRequest.java
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
 * Class used to create a GenericEnumerationGetRequest Udt Request
 *
 */

public class GenericEnumerationGetRequest extends GenericEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  GenericEnumerationGetRequest
 * @param id Unique request name
 * @param GEGetIn GEObjectKeyData for GenericEnumerationGetRequest
 *
 */
@JsonCreator
  public GenericEnumerationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenericEnumeration")GEObjectKeyData GEGetIn) {
    super(id, "GenericEnumerationGet");
    if (GEGetIn != null) {
      addInput("GenericEnumeration", GEObjectKeyHelper.toMap(GEGetIn, new HashMap(), "GEObjectKeyData").get("GEObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GEObjectData that results from the GenericEnumerationGetRequest call
 * @return GEObjectData resulting from udt call
 *
 */

  public GEObjectData getOutput() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
}
