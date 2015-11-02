/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationSequenceGetRequest.java
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
 * Class used to create a BsdApplicationSequenceGetRequest Udt Request
 *
 */

public class BsdApplicationSequenceGetRequest extends BsdApplicationSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdApplicationSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdApplicationSequenceGet");
  }

/**
 *
 * Retrieves the BsdApplicationObjectKeyData that results from the BsdApplicationSequenceGetRequest call
 * @return BsdApplicationObjectKeyData resulting from udt call
 *
 */

  public BsdApplicationObjectKeyData getOutput() {
    return BsdApplicationObjectKeyHelper.fromMap(outputMap, "BsdApplication");
  }
}
