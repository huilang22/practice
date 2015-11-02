/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemDeleteRequest.java
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
 * Class used to create a OpenItemDeleteRequest Udt Request
 *
 */

public class OpenItemDeleteRequest extends OpenItemSubRequestParent {
/**
 *
 * Constructor to create a  OpenItemDeleteRequest
 * @param id Unique request name
 * @param OIIDeleteIn OpenItemObjectKeyData for OpenItemDeleteRequest
 *
 */
@JsonCreator
  public OpenItemDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItem")OpenItemObjectKeyData OIIDeleteIn) {
    super(id, "OpenItemDelete");
    if (OIIDeleteIn != null) {
      addInput("OpenItem", OpenItemObjectKeyHelper.toMap(OIIDeleteIn, new HashMap(), "OpenItemObjectKeyData").get("OpenItemObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OpenItemObjectData that results from the OpenItemDeleteRequest call
 * @return OpenItemObjectData resulting from udt call
 *
 */

  public OpenItemObjectData getOutput() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
}
