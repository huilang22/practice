/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectSequenceGetRequest.java
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
 * Class used to create a BsdObjectSequenceGetRequest Udt Request
 *
 */

public class BsdObjectSequenceGetRequest extends BsdObjectSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdObjectSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdObjectSequenceGet");
  }

/**
 *
 * Retrieves the BsdObjectObjectKeyData that results from the BsdObjectSequenceGetRequest call
 * @return BsdObjectObjectKeyData resulting from udt call
 *
 */

  public BsdObjectObjectKeyData getOutput() {
    return BsdObjectObjectKeyHelper.fromMap(outputMap, "BsdObject");
  }
}
