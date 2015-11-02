/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemGetRequest.java
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
 * Class used to create a OpenItemGetRequest Udt Request
 *
 */

public class OpenItemGetRequest extends OpenItemSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemGetRequest
 * @param id Unique request name
 * @param OIIGetIn OpenItemObjectKeyData for OpenItemGetRequest
 *
 */
@JsonCreator
  public OpenItemGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItem")OpenItemObjectKeyData OIIGetIn) {
    super(id, "OpenItemGet");
    if (OIIGetIn != null) {
      addInput("OpenItem", OpenItemObjectKeyHelper.toMap(OIIGetIn, new HashMap(), "OpenItemObjectKeyData").get("OpenItemObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OpenItemObjectData that results from the OpenItemGetRequest call
 * @return OpenItemObjectData resulting from udt call
 *
 */

  public OpenItemObjectData getOutput() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
}
