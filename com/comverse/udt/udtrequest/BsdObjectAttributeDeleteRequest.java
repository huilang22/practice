/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeDeleteRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdObjectAttributeDeleteRequest Udt Request
 *
 */

public class BsdObjectAttributeDeleteRequest extends BsdObjectAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectAttributeDeleteRequest
 * @param id Unique request name
 * @param bsdObjectAttributeDeleteIn BsdObjectAttributeObjectBaseKeyData for BsdObjectAttributeDeleteRequest
 *
 */
@JsonCreator
  public BsdObjectAttributeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObjectAttribute")BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeDeleteIn) {
    super(id, "BsdObjectAttributeDelete");
    if (bsdObjectAttributeDeleteIn != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseKeyHelper.toMap(bsdObjectAttributeDeleteIn, new HashMap(), "BsdObjectAttributeObjectBaseKeyData").get("BsdObjectAttributeObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdObjectAttributeObjectBaseData that results from the BsdObjectAttributeDeleteRequest call
 * @return BsdObjectAttributeObjectBaseData resulting from udt call
 *
 */

  public BsdObjectAttributeObjectBaseData getOutput() {
    return BsdObjectAttributeObjectBaseHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
}
