/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultDeleteRequest.java
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
 * Class used to create a BsdAttributeDefaultDeleteRequest Udt Request
 *
 */

public class BsdAttributeDefaultDeleteRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeDefaultDeleteRequest
 * @param id Unique request name
 * @param bsdAttributeDefaultDeleteIn BsdAttributeDefaultObjectBaseKeyData for BsdAttributeDefaultDeleteRequest
 *
 */
@JsonCreator
  public BsdAttributeDefaultDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeDefault")BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultDeleteIn) {
    super(id, "BsdAttributeDefaultDelete");
    if (bsdAttributeDefaultDeleteIn != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(bsdAttributeDefaultDeleteIn, new HashMap(), "BsdAttributeDefaultObjectBaseKeyData").get("BsdAttributeDefaultObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeDefaultObjectBaseData that results from the BsdAttributeDefaultDeleteRequest call
 * @return BsdAttributeDefaultObjectBaseData resulting from udt call
 *
 */

  public BsdAttributeDefaultObjectBaseData getOutput() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
