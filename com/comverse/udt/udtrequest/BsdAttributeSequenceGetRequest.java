/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeSequenceGetRequest.java
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
 * Class used to create a BsdAttributeSequenceGetRequest Udt Request
 *
 */

public class BsdAttributeSequenceGetRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdAttributeSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdAttributeSequenceGet");
  }

/**
 *
 * Retrieves the BsdAttributeObjectKeyData that results from the BsdAttributeSequenceGetRequest call
 * @return BsdAttributeObjectKeyData resulting from udt call
 *
 */

  public BsdAttributeObjectKeyData getOutput() {
    return BsdAttributeObjectKeyHelper.fromMap(outputMap, "BsdAttribute");
  }
}
