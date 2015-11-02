/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleSequenceGetRequest.java
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
 * Class used to create a BsdLocaleSequenceGetRequest Udt Request
 *
 */

public class BsdLocaleSequenceGetRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a  BsdLocaleSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdLocaleSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdLocaleSequenceGet");
  }

/**
 *
 * Retrieves the BsdLocaleObjectKeyData that results from the BsdLocaleSequenceGetRequest call
 * @return BsdLocaleObjectKeyData resulting from udt call
 *
 */

  public BsdLocaleObjectKeyData getOutput() {
    return BsdLocaleObjectKeyHelper.fromMap(outputMap, "BsdLocale");
  }
}
