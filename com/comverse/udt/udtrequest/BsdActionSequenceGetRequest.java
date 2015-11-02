/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionSequenceGetRequest.java
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
 * Class used to create a BsdActionSequenceGetRequest Udt Request
 *
 */

public class BsdActionSequenceGetRequest extends BsdActionSubRequestParent {
/**
 *
 * Constructor to create a  BsdActionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdActionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdActionSequenceGet");
  }

/**
 *
 * Retrieves the BsdActionObjectKeyData that results from the BsdActionSequenceGetRequest call
 * @return BsdActionObjectKeyData resulting from udt call
 *
 */

  public BsdActionObjectKeyData getOutput() {
    return BsdActionObjectKeyHelper.fromMap(outputMap, "BsdAction");
  }
}
