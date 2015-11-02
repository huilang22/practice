/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultSequenceGetRequest.java
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
 * Class used to create a BsdAttributeDefaultSequenceGetRequest Udt Request
 *
 */

public class BsdAttributeDefaultSequenceGetRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeDefaultSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdAttributeDefaultSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdAttributeDefaultSequenceGet");
  }

/**
 *
 * Retrieves the BsdAttributeDefaultObjectBaseKeyData that results from the BsdAttributeDefaultSequenceGetRequest call
 * @return BsdAttributeDefaultObjectBaseKeyData resulting from udt call
 *
 */

  public BsdAttributeDefaultObjectBaseKeyData getOutput() {
    return BsdAttributeDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
