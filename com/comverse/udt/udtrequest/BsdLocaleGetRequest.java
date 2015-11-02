/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleGetRequest.java
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
 * Class used to create a BsdLocaleGetRequest Udt Request
 *
 */

public class BsdLocaleGetRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a  BsdLocaleGetRequest
 * @param id Unique request name
 * @param bsdLocaleGetIn BsdLocaleObjectKeyData for BsdLocaleGetRequest
 *
 */
@JsonCreator
  public BsdLocaleGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdLocale")BsdLocaleObjectKeyData bsdLocaleGetIn) {
    super(id, "BsdLocaleGet");
    if (bsdLocaleGetIn != null) {
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(bsdLocaleGetIn, new HashMap(), "BsdLocaleObjectKeyData").get("BsdLocaleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdLocaleObjectData that results from the BsdLocaleGetRequest call
 * @return BsdLocaleObjectData resulting from udt call
 *
 */

  public BsdLocaleObjectData getOutput() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
}
